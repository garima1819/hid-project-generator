package com.deloitte.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class {{cookiecutter.resource_name}}ControllerImpl implements {{cookiecutter.resource_name}}Controller {

    @Autowired
    private {{cookiecutter.resource_name}}Service service;
    
}
