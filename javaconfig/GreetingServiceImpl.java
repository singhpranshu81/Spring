package com.mph.javaconfig;


public class GreetingServiceImpl implements GreetingService{
   
	private String g;
   
	public GreetingServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GreetingServiceImpl(String g) {
		super();
		this.g = g;
	}

	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g = g;
	}

	@Override
	public String sayHello() {
		
		return g;
	}

}
