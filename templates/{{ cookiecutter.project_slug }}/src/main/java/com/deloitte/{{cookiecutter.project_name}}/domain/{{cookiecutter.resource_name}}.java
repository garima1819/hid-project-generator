package com.deloitte.{{cookiecutter.project_name}}.domain;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name="{{cookiecutter.resource_name}}")
public class {{cookiecutter.resource_name}} {
    // define fields

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="{{cookiecutter.resource_name}}Id")
    private Long {{cookiecutter.resource_name | lower}}Id;

    @Column(name="{{cookiecutter.resource_name}}Name")
    private String {{cookiecutter.resource_name | lower}}Name;

}