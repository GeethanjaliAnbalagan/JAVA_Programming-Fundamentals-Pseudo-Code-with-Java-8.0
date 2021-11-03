package com.java.SpringBeanFactory4.SpringBeanFactory_4;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Question {
private int id;
private String name;
private Map<Answer,User> answers;

public Question() {}
public Question(int id, String name, Map<Answer, User> answers) {
	super();
	this.id = id;
	this.name = name;
	this.answers = answers;
}


public void displayInfo(){
	System.out.println("question id:"+id);
	System.out.println("question name:"+name);
	System.out.println("Answers....");
	Set<Entry<Answer, User>> set=answers.entrySet();
	Iterator<Entry<Answer, User>> itr=set.iterator();
	while(itr.hasNext()){
		Entry<Answer, User> entry=itr.next();
		Answer ans=entry.getKey();
		User user=entry.getValue();
		System.out.println("Answer Information:");
		System.out.println(ans);
		System.out.println("Posted By:");
		System.out.println(user);
	}
}
}
