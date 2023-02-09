package com.deloitte.{{cookiecutter._pkg_name}}.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "{{cookiecutter.resource_name}}")
public class {{cookiecutter.resource_name}} {

// define fields

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="{{cookiecutter.resource_name}}Id")
	private Long {{cookiecutter.resource_name | lower}}Id;

	@Column(name="{{cookiecutter.resource_name}}Name")
	private String {{cookiecutter.resource_name | lower}}Name;

}