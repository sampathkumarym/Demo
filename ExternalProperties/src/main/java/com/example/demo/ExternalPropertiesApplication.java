package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.servicefactory.FakeDataSource;

@SpringBootApplication
public class ExternalPropertiesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ExternalPropertiesApplication.class, args);
		
		FakeDataSource f = ctx.getBean(FakeDataSource.class);
		System.out.println(f.getUserName());
		System.out.println(f.getPwd());
		System.out.println(f.getJdbcUrl());
	}

}
