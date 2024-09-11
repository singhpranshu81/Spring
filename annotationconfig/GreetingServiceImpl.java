package com.mph.annotationconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceImpl implements GreetingService{
   @Value("rgrgdrgd")
	private String g;
   
	@Override
	public String sayHello() {
		
		return g;
	}

}
