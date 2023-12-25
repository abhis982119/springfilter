package com.filter.implementingFilter.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.filter.implementingFilter")
@SpringBootApplication
public class ImplementingFilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImplementingFilterApplication.class, args);
	}

}
