package com.deloitte;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{cookiecutter.project_slug}}Application {

	private static final Logger log = LoggerFactory.getLogger({{cookiecutter.project_slug}}Application.class);

	public static void main(String[] args) {

		log.info("Application Starting...");
		SpringApplication.run({{cookiecutter.project_slug}}Application.class, args);
		log.info("Application Started");

	}

}