package com.deloitte.{{cookiecutter._pkg_name}}.domain;
{%- if cookiecutter.spring_version|list|first|int >= 3 %}
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
{% else %}
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
{%- endif %}
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