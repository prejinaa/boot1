package com.javainuse.bootmysqlcrud.config;




import com.javainuse.bootmysqlcrud.entity.User;
import com.javainuse.bootmysqlcrud.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.stream.Collectors;


@Service

public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;
    // loading user details from a data source from database based on the username and create user detail object and compare yhe user password with user detail object password to authenticate

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo .findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        String role = user.getRole().startsWith("ROLE_") ? user.getRole() : "ROLE_" + user.getRole();

        return org.springframework.security.core.userdetails.User.withUsername(user.getUsername())
                .password(user.getPassword())
                .authorities(Collections.singleton(new SimpleGrantedAuthority(role)))
                .accountExpired(false)
                .accountLocked(false)
                .credentialsExpired(false)
                .disabled(false)
                .build();
    }
}


