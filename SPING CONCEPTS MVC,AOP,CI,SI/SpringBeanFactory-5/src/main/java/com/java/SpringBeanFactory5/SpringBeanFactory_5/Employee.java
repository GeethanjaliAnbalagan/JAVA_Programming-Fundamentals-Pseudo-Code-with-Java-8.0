package com.java.SpringBeanFactory5.SpringBeanFactory_5;

public class Employee {
private int id;
private String name;
private Address address;
public Employee() {}

public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Employee(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}

void show(){
	System.out.println(id+" "+name);
	System.out.println(address);
}

}
