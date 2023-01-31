package com.deloitte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{cookiecutter.project_slug}}Application {

	public static void main(String[] args) {
		SpringApplication.run({{cookiecutter.resource_name}}Application.class, args);
	}

}
