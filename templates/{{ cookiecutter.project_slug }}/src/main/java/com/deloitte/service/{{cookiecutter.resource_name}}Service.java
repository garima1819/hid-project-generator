package com.deloitte.service;

import java.util.List;

public interface {{cookiecutter.resource_name}}Service {

    public void save{{cookiecutter.resource_name}}({{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}});
    public void update{{cookiecutter.resource_name}}(Long id, {{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}});
    public void delete{{cookiecutter.resource_name}}ById(Long id);
    public List<{{cookiecutter.resource_name}}> get{{cookiecutter.resource_name}}s();
    public {{cookiecutter.resource_name}} get{{cookiecutter.resource_name}}ById(Long id);

}