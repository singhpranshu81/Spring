package com.mph.welcome;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassWelcome {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spr-welcome.xml");
		
		Welcome w = (Welcome) context.getBean("wel");
		System.out.println(w.sayHello());
	}

}
