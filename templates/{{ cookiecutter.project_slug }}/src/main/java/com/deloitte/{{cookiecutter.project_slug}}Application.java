package com.deloitte;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class {{cookiecutter.project_slug}}Application {


	public static void main(String[] args) {

		log.info("Application Starting...");
		SpringApplication.run({{cookiecutter.project_slug}}Application.class, args);
		log.info("Application Started");

	}

}