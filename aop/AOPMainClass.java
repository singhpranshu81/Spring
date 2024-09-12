package com.mph.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spr-aop.xml");
		Car c= context.getBean("car",Car.class);
		
		System.out.println(c.getName());
	}

}
