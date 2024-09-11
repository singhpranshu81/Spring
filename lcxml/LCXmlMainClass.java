package com.mph.lcxml;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LCXmlMainClass {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spr-lcxml.xml");
		
		School sch= (School) context.getBean("school");
		System.out.println(sch.getId());
		
		context.registerShutdownHook();
	}

}
