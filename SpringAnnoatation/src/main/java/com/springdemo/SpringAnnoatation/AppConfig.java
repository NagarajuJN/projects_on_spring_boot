package com.springdemo.SpringAnnoatation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration															// this class is responsible for  is a Config so we need to use @config



public class AppConfig
{
	@Bean(name = "iphone")
	public Iphone getPhone()

	{
		return new Iphone();
	}	
	
	
}
