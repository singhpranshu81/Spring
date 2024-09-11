package com.mph.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
     @Bean(name = "gs1")
	public GreetingServiceImpl getgs1() {
		GreetingServiceImpl gs=new GreetingServiceImpl();
		gs.setG("bhkk");
		return gs;
	}
	
     @Bean(name = "gs2")
 	public GreetingServiceImpl getgs2() {
 		GreetingServiceImpl gs=new GreetingServiceImpl("fgnfh");//this is using constructor
 		
 		return gs;
 	}
}
