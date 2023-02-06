package com.deloitte.{{cookiecutter._pkg_name}};

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class {{ cookiecutter.project_name|replace('-', ' ')|title|replace(' ', '') }}ApplicationTests {

	@Test
	void contextLoads() {

	}

}
