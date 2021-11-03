package com.java.SpringBeanFactory7.SpringBeanFactory_7;

import java.util.Iterator;
import java.util.List;

public class Question {
private int id;
private String name;
private List<Answer> answers;


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


public List<Answer> getAnswers() {
	return answers;
}


public void setAnswers(List<Answer> answers) {
	this.answers = answers;
}


public void displayInfo(){
	System.out.println(id+" "+name);
	System.out.println("answers are:");
	Iterator<Answer> itr=answers.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}

}
