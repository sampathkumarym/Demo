package com.example.demo.servicefactory;

import javax.persistence.Id;

import lombok.Data;

@Data
public class FakeDataSource {
	@Id
	private String userName;
	private String pwd;
	private String jdbcUrl;
	
	
}
