package com.deloitte.{{cookiecutter._pkg_name}}.service;

import com.deloitte.{{cookiecutter._pkg_name}}.domain.{{cookiecutter.resource_name}};
import java.util.List;

public interface {{cookiecutter.resource_name}}Service {

    {{cookiecutter.resource_name}} save{{cookiecutter.resource_name}}({{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}});
    {{cookiecutter.resource_name}} update{{cookiecutter.resource_name}}(Long id, {{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}});
    void delete{{cookiecutter.resource_name}}ById(Long id);
    List<{{cookiecutter.resource_name}}> get{{cookiecutter.resource_name}}s();
    {{cookiecutter.resource_name}} get{{cookiecutter.resource_name}}ById(Long id);

}