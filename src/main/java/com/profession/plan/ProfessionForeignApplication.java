package com.profession.plan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ProfessionForeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfessionForeignApplication.class, args);
	}

}
