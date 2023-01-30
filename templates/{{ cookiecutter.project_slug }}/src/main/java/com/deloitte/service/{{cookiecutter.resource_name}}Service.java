package com.deloitte.service;

import java.util.Collection;
//import com.deloitte.Product; to be confirmed

public interface {{cookiecutter.resource_name}}Service {

    public void create{{cookiecutter.resource_name}}({{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}});
    public void update{{cookiecutter.resource_name}}(Object id, {{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}});
    public void delete{{cookiecutter.resource_name}}(Object id);
    public Collection<{{cookiecutter.resource_name}}> get{{cookiecutter.resource_name}}s();

}