package com.deloitte.service.serviceImpl;

import java.util.Collection;
//import com.deloitte.Product; to be confirmed

@Service
public class  {{cookiecutter.resource_name}}ServiceImpl implements {{cookiecutter.resource_name}}Service
        {

@Autowired
                    {{cookiecutter.resource_name}}Repo {{cookiecutter.resource_name|lower}}Repo;

@Override
public {{cookiecutter.resource_name}} create{{cookiecutter.resource_name}}({{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}})
        {
        return {{cookiecutter.resource_name}}Repo.save({{cookiecutter.resource_name|lower}});
        }

@Override
public {{cookiecutter.resource_name}} update{{cookiecutter.resource_name}}(Object id,{{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}})
        {
        {{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}}Obj={{cookiecutter.resource_name|lower}}Repo.get(id);
        //update the required fields
        return {{cookiecutter.resource_name|lower}}Repo.save({{cookiecutter.resource_name|lower}}Obj);
        }
@Override
public void delete{{cookiecutter.resource_name}}(Object id)
        {
        {{cookiecutter.resource_name|lower}}Repo.deleteById(id);
        }

@Override
public Collection<{{cookiecutter.resource_name}}>get{{cookiecutter.resource_name}}s()
        {
        return {{cookiecutter.resource_name|lower}}Repo.findAll();
        }
}