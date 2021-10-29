package com.java.SpringConceptBasics.SpringCoreStudent;

public class Student {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void displayInfo(){
	System.out.println("Hello: "+name);
}
}
