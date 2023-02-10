package com.deloitte.{{cookiecutter.project_slug}}.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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