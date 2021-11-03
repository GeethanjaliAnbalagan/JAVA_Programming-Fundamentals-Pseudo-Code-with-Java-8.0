package com.javacodegeeks.snippets.enterprise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javacodegeeks.snippets.enterprise.services.Person;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");
						
			Person person = (Person) context.getBean("personBean");
			
			System.out.println(person.toString());
	}
}