package com.deloitte.{{cookiecutter._pkg_name}}.util;

import com.deloitte.{{cookiecutter._pkg_name}}.domain.{{cookiecutter.resource_name}};

public class {{cookiecutter.resource_name}}TestUtil {
    public static {{cookiecutter.resource_name}} create{{cookiecutter.resource_name}}(Long id, String name) {

        {{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}} = new {{cookiecutter.resource_name}}();
        {{cookiecutter.resource_name|lower}}.set{{cookiecutter.resource_name}}Id(id);
        {{cookiecutter.resource_name|lower}}.set{{cookiecutter.resource_name}}Name(name);

        return {{cookiecutter.resource_name|lower}};
    }
}
