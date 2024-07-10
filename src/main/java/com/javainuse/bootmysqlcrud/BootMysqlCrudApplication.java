package com.javainuse.bootmysqlcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.javainuse.bootmysqlcrud.repository")
public class BootMysqlCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMysqlCrudApplication.class, args);
	}

}
