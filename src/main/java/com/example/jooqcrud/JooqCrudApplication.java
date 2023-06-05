package com.example.jooqcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("/employees")
public class JooqCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(JooqCrudApplication.class, args);
	}

}
