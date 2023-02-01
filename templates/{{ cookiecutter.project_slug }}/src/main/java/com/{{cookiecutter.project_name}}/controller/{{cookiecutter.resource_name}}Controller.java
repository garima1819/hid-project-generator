package com.{{cookiecutter.project_name}}.controller;

import com.{{cookiecutter.project_name}}.domain.{{cookiecutter.resource_name}};
import com.{{cookiecutter.project_name}}.service.{{cookiecutter.resource_name}}Service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class {{cookiecutter.resource_name}}Controller {

    private static final Logger log = LoggerFactory.getLogger({{cookiecutter.resource_name}}Controller.class);

    @Autowired
    private {{cookiecutter.resource_name}}Service {{cookiecutter.resource_name|lower}}Service;

    @GetMapping("/{{cookiecutter.resource_name|lower}}s")
    public List<{{cookiecutter.resource_name}}> get{{cookiecutter.resource_name}}s() {
        return {{cookiecutter.resource_name|lower}}Service.get{{cookiecutter.resource_name}}s();
    }

    @GetMapping("/{{cookiecutter.resource_name|lower}}/{id}")
    public {{cookiecutter.resource_name}} get{{cookiecutter.resource_name}}ById(@PathVariable Long id) {
        return {{cookiecutter.resource_name|lower}}Service.get{{cookiecutter.resource_name}}ById(id);
    }

    @PostMapping("/{{cookiecutter.resource_name|lower}}")
    public {{cookiecutter.resource_name}} save{{cookiecutter.resource_name}}(@RequestBody {{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}}) {
        return {{cookiecutter.resource_name|lower}}Service.save{{cookiecutter.resource_name}}({{cookiecutter.resource_name|lower}});
    }

    @PutMapping("/{{cookiecutter.resource_name|lower}}/{id}")
    public {{cookiecutter.resource_name}} update{{cookiecutter.resource_name}}(@PathVariable Long id, @RequestBody {{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}}) {
        return {{cookiecutter.resource_name|lower}}Service.update{{cookiecutter.resource_name}}(id, {{cookiecutter.resource_name|lower}});
    }

    @DeleteMapping("/{{cookiecutter.resource_name|lower}}/{id}")
    public void delete{{cookiecutter.resource_name}}(@PathVariable Long id) {
        {{cookiecutter.resource_name|lower}}Service.delete{{cookiecutter.resource_name}}ById(id);
    }
}
