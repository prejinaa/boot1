package com.javainuse.bootmysqlcrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")

public class UserController {

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Hello Admin";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "Hello User";
    }
}
