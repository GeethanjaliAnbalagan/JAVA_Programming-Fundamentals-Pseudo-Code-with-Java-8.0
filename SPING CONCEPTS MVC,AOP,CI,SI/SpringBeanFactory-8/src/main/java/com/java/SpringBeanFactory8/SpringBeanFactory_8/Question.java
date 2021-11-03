package com.java.SpringBeanFactory8.SpringBeanFactory_8;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Question {
private int id;
private String name;
private Map<String,String> answers;


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


public Map<String, String> getAnswers() {
	return answers;
}


public void setAnswers(Map<String, String> answers) {
	this.answers = answers;
}


public void displayInfo(){
	System.out.println("question id:"+id);
	System.out.println("question name:"+name);
	System.out.println("Answers....");
	Set<Entry<String, String>> set=answers.entrySet();
	Iterator<Entry<String, String>> itr=set.iterator();
	while(itr.hasNext()){
		Entry<String,String> entry=itr.next();
		System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());
	}
}
}
