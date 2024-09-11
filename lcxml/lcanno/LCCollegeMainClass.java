package com.mph.lcanno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LCCollegeMainClass {
  public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spr-lcanno.xml");
		
		College c= (College) context.getBean("college");
		
		System.out.println(c.getId());
		context.registerShutdownHook();
		
}
}
