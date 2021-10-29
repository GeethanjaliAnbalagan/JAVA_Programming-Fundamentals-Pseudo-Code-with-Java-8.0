package com.java.SpringConceptBasics.SpringCoreStudent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
//	Resource resource=new ClassPathResource("applicationContext.xml");
//	BeanFactory factory=new XmlBeanFactory(resource);
	@SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

	Student student=(Student)context.getBean("studentbean");
	student.displayInfo();
}
}
