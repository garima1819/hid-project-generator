package com.deloitte.service.serviceImpl;

import com.deloitte.domain.{{cookiecutter.resource_name}};
import com.deloitte.repository.{{cookiecutter.resource_name}}Repository;
import com.deloitte.service.{{cookiecutter.resource_name}}Service;
import com.deloitte.exception.ResourceNotFoundException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Slf4j
@Service
public class {{cookiecutter.resource_name}}ServiceImpl implements {{cookiecutter.resource_name}}Service {

    private static final Logger log = LoggerFactory.getLogger({{cookiecutter.resource_name}}ServiceImpl.class);

    @Autowired
    {{cookiecutter.resource_name}}Repository {{cookiecutter.resource_name|lower}}Repository;

    @Override
    public {{cookiecutter.resource_name}} save{{cookiecutter.resource_name}}({{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}}) {
        return {{cookiecutter.resource_name|lower}}Repository.save({{cookiecutter.resource_name|lower}});
    }

    @Override
    public {{cookiecutter.resource_name}} update{{cookiecutter.resource_name}}(Long id, {{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}}) {
        {{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}}Obj = {{cookiecutter.resource_name|lower}}Repository.findById(id)
                                       .orElseThrow(() -> new ResourceNotFoundException("{{cookiecutter.resource_name}} Not Found"));
        //update the required fields
        return {{cookiecutter.resource_name|lower}}Repository.save({{cookiecutter.resource_name|lower}}Obj);
    }

    @Override
    public void delete{{cookiecutter.resource_name}}ById(Long id) {
        {{cookiecutter.resource_name|lower}}Repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("{{cookiecutter.resource_name}} Not Found"));
        {{cookiecutter.resource_name|lower}}Repository.deleteById(id);
    }

    @Override
    public List<{{cookiecutter.resource_name}}>get{{cookiecutter.resource_name}}s() {
        return {{cookiecutter.resource_name|lower}}Repository.findAll();
    }

    @Override
    public {{cookiecutter.resource_name}} get{{cookiecutter.resource_name}}ById(Long id) {
        return {{cookiecutter.resource_name|lower}}Repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("{{cookiecutter.resource_name}} Not Found"));
    }
}