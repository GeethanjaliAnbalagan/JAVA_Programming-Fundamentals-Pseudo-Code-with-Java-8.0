package com.java.methodreference;
// Method reference to a constructor


	class Hello{  
	    public Hello(String say){  
	        System.out.print(say);  
	    }  
	} 
	public class MethodReference4 {
	    public static void main(String[] args) { 
	    	//Method reference to a constructor
	        MyInterface1 ref = Hello::new;  
	        ref.display("Hello World!");  
	    }  
	}
