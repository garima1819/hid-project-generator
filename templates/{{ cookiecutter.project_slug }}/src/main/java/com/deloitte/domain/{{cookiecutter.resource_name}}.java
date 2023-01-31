package com.deloitte.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="{{cookiecutter.resource_name}}")
public class {{cookiecutter.resource_name}} {

// define fields

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="{{cookiecutter.resource_name}}id")
	private Long {{cookiecutter.resource_name | lower}}id;

	@Column(name="{{cookiecutter.resource_name}}Name")
	private String {{cookiecutter.resource_name | lower}}Name;

}