package com.java.SpringCoreAnnotation.SpringAnnotation;

public class car implements vechile {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void rider()
	{
		
		System.out.println("Good rider " +name);
		System.out.println("Currently riding car");
		
		
	}
}
