package com.java.SpringBeanFactory7.SpringBeanFactory_7;

public class Answer {
private int id;
private String name;
private String by;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBy() {
	return by;
}


public void setBy(String by) {
	this.by = by;
}


public String toString(){
	return id+" "+name+" "+by;
}
}
