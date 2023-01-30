package com.deloitte.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class {{cookiecutter.resource_name}}Controller {

    @Autowired
    private {{cookiecutter.resource_name}}Service service;

    @GetMapping("/{{cookiecutter.resource_name}}s")
    public List<{{cookiecutter.resource_name}}> get{{cookiecutter.resource_name}}s() {
        return service.get{{cookiecutter.resource_name}}s();
    }

    @GetMapping("/{{cookiecutter.resource_name}}s/{id}")
    public List<{{cookiecutter.resource_name}}> get{{cookiecutter.resource_name}}ById(@PathVariable Long id) {
        return service.get{{cookiecutter.resource_name}}ById(id);
    }

    @PostMapping("/{{cookiecutter.resource_name}}s")
    public {{cookiecutter.resource_name}} save{{cookiecutter.resource_name}}(@RequestBody {{cookiecutter.resource_name}} customer) {
        return service.save{{cookiecutter.resource_name}}({{cookiecutter.resource_name}});
    }

    @PutMapping("/{{cookiecutter.resource_name}}s/{id}")
    public {{cookiecutter.resource_name}} update{{cookiecutter.resource_name}}(@PathVariable Long id, @RequestBody {{cookiecutter.resource_name}} customer) {
        return service.update{{cookiecutter.resource_name}}({{cookiecutter.resource_name}});
    }

    @DeleteMapping("/{{cookiecutter.resource_name}}s/{id}")
    public void delete{{cookiecutter.resource_name}}(@PathVariable Long id) {
        service.delete{{cookiecutter.resource_name}}ById(id);
    }
}
