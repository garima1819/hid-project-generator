package com.deloitte.{{cookiecutter._pkg_name}}.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
