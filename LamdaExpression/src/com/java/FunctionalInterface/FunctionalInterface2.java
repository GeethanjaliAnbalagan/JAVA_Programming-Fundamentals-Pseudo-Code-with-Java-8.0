package com.java.FunctionalInterface;



	// Java program to demonstrate Implementation of
	// functional interface using lambda expressions

public class FunctionalInterface2 {
	public static void main(String args[])
	{

		// lambda expression to create the object
		Thread obj = new Thread(()->
		{System.out.println("New thread created");});
		obj.start();
	}
	}
