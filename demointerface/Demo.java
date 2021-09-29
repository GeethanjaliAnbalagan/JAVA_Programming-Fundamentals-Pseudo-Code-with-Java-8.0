package com.java.demointerface;

public class Demo implements MyInterface {

	public void method1() {

		System.out.println("Method 1");
	}

	public void method2() {

		System.out.println("Method 2");
	}
	
	public static void main(String[] args) {
		
		MyInterface obj = new Demo();
		obj.method1();
		obj.method2();
		
	}

}
