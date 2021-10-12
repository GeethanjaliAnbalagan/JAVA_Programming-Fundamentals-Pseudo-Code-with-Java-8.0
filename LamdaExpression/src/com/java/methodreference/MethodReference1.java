package com.java.methodreference;
//Method reference to an instance method of an object
	
	public class MethodReference1 {
	    public void myMethod(){  
		System.out.println("Instance Method");  
	    }  
	    public static void main(String[] args) {  
	    	MethodReference1 obj = new MethodReference1();   
		// Method reference using the object of the class
		MyInterface ref = obj::myMethod;  
		// Calling the method of functional interface  
		ref.display();  
	    }  
	}
