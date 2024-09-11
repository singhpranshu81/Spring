package com.mph.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigMain {

	public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		GreetingService w = (GreetingService) context.getBean("gs1");
		System.out.println(w.sayHello());
	}

}
