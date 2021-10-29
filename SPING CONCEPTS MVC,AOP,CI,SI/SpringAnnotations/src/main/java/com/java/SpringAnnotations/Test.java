package com.java.SpringAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		 System.out.println( "Hello World!" );
	        @SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	        vechile obj = (vechile)context.getBean("vechile");
	        obj.drive();
	}
}
