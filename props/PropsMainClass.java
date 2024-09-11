package com.mph.props;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropsMainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spr-props.xml");
		
		DBServer ds= (DBServer) context.getBean("dao");
		System.out.println(ds.getDbURL());
		System.out.println(ds.getPassword());
		System.out.println(ds.getUsername());
		
	}

}
