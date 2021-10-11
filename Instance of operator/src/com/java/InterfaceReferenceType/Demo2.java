package com.java.InterfaceReferenceType;



public class Demo2 {

	public static void main(String[] args) {

	    // create a variable of string type
	    String name = "Programiz";
	    //String name = null;
	    
	    // checks if name is instance of String
	    boolean result1 = name instanceof String;
	    System.out.println("name is an instance of String: " + result1);

	    // create an object of Main
	    Demo2 obj = new Demo2();

	    // checks if obj is an instance of Main
	    boolean result2 = obj instanceof Demo2;
	    System.out.println("obj is an instance of Main: " + result2);
	  }
	}