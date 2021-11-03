package com.javacodegeeks.snippets.enterprise.services;

import com.javacodegeeks.snippets.enterprise.interfaces.Mandatory;


public class Person {

	private String name;
	
	private Employee employee;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getEmployee() {
		return employee;
	}

	@Mandatory
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override 
	public String toString(){
		return "Person " + name + " is an employee, with " + employee + ".";
	}
}
