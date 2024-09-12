package com.mph.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectClass {
	
	@Before("allGetters()")
  public void logMessage() {
	  System.out.println("Logging now...");
  }
	
	@Pointcut("execution(public * get*())")
	public void allGetters() {
		
	}
}
 