package com.java.FunctionalInterface;



	// Java program to demonstrate functional interface

public class FuntionalInterface1 {
	
		public static void main(String args[])
		{
			// create anonymous inner class object
			Thread obj = new Thread(new Runnable()
			{
				@Override
				public void run()
				{
					System.out.println("New thread created");
				}
			});
			
			obj.start();
		}
	}
