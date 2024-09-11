package com.mph.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AutowireMainClass {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spr-autowire.xml");
		
		Car w = (Car) context.getBean("car");
		System.out.println(w.getName() + " "+ w.getModel());
		User us = (User) context.getBean("user");
		System.out.println(us.getUsername()+" has "+us.getCar().getName());
	}

}
