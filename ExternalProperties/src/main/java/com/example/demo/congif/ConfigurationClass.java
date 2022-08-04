package com.example.demo.congif;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import com.example.demo.servicefactory.FakeDataSource;

@PropertySource("classpath:application.properties")
@Configuration
public class ConfigurationClass {
	@Bean
	FakeDataSource fakeDataSource (@Value("${userName}") String userName,
								   @Value("${pwd}") String pwd,
								   @Value("${jdbcUrl}") String jdbcUrl) {
		
		
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUserName(userName);
		fakeDataSource.setPwd(pwd);
		fakeDataSource.setJdbcUrl(jdbcUrl);
		return fakeDataSource;
		
	}	
}