package com.java.inheritance;

public class Dog extends Animal{

	@Override
   public void eat() {
		super.eat();
		System.out.println("I m dog i eat meat");
	}

	
	public void display() {
		
		System.out.println("This is dog" +name);
	}
	

}
