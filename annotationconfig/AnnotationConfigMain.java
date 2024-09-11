package com.mph.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConfigMain {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spr-annotationconfig.xml");
		
		GreetingService w = (GreetingService) context.getBean("greetingServiceImpl");
		System.out.println(w.sayHello());
	}

}
