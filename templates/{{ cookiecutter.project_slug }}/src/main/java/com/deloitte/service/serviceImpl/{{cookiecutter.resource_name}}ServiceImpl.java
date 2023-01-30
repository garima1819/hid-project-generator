package com.deloitte.service.serviceImpl;

import java.util.Collection;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
//import com.deloitte.Product; to be confirmed

@Service
public class {{cookiecutter.resource_name}}ServiceImpl implements {{cookiecutter.resource_name}}Service {

    @Autowired
    {{cookiecutter.resource_name}}Repository {{cookiecutter.resource_name|lower}}Repository;

    @Override
    public {{cookiecutter.resource_name}} create{{cookiecutter.resource_name}}({{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}}) {
        return {{cookiecutter.resource_name}}Repository.save({{cookiecutter.resource_name|lower}});
    }

    @Override
    public {{cookiecutter.resource_name}} update{{cookiecutter.resource_name}}(Object id,{{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}}) {
        {{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}}Obj={{cookiecutter.resource_name|lower}}Repository.get(id);
        //update the required fields
        return {{cookiecutter.resource_name|lower}}Repository.save({{cookiecutter.resource_name|lower}}Obj);
    }

    @Override
    public void delete{{cookiecutter.resource_name}}(Object id) {
        {{cookiecutter.resource_name|lower}}Repository.deleteById(id);
    }

    @Override
    public Collection<{{cookiecutter.resource_name}}>get{{cookiecutter.resource_name}}s() {
        return {{cookiecutter.resource_name|lower}}Repository.findAll();
    }
}