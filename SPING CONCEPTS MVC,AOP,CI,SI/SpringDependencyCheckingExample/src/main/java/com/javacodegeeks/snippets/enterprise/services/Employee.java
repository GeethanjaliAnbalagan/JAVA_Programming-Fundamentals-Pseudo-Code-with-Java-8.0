package com.javacodegeeks.snippets.enterprise.services;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
	
	private Long id;

	private String position;
	
	public Long getId() {
		return id;
	}

	@Required
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString(){
		return "id "+ id + " and position " + position;
	}
}
