package com.deloitte.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{cookiecutter.resource_name}}Application {

	public static void main(String[] args) {
		SpringApplication.run({{cookiecutter.resource_name}}Application.class, args);
	}

}
