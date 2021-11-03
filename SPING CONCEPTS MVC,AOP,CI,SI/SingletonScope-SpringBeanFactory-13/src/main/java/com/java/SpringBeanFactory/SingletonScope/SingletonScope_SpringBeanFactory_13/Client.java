package com.java.SpringBeanFactory.SingletonScope.SingletonScope_SpringBeanFactory_13;

//Java program to illustrate
//the client to perform the
//request to the defined bean

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.SpringBeanFactory.SingletonScope.SingletonScope_SpringBeanFactory_13.HelloWorld;

//Client Class to request the
//above defined bean
public class Client {

	public static void main(String[] args) {
		// Load the Spring XML configuration
		// file into IoC container
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");

		// Get the "HelloWorld" bean object
		// and call getName() method
		HelloWorld Gee1 = (HelloWorld) ap.getBean("hw");

		// Set the name
		Gee1.setName("Geethanjali");
		System.out.println("Hello object (hello1)" + " Your name is: " + Gee1.getName());

		// Get another "HelloWorld" bean object
		// and call getName() method
		HelloWorld Gee2 = (HelloWorld) ap.getBean("hw");

		System.out.println("Hello object (hello2)" + " Your name is: " + Gee2.getName());

		// Now compare the references to see
		// whether they are pointing to the
		// same object or different object
		System.out.println("'Gee1' and 'Gee2'" + " are referring" + "to the same object: " + (Gee1 == Gee2));

		// Print the address of both
		// object Geeks1 and Geeks2
		System.out.println("Address of object Gee1: " + Gee1);
		System.out.println("Address of object Gee2: " + Gee2);
	}
}
