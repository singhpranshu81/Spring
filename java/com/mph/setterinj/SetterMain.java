package com.mph.setterinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SetterMain {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spr-setter.xml");
		
		Car w = (Car) context.getBean("car");
		System.out.println(w.getName() + " "+ w.getModel());
	}

}
