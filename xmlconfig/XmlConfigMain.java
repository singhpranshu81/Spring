package com.mph.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigMain {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spr-xmlconfig.xml");
		
		GreetingService w = (GreetingService) context.getBean("gs");
		System.out.println(w.sayHello());
	}

}
