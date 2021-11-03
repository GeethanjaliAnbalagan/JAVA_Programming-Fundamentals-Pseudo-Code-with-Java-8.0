package com.java.SpringBeanFactory.AutowiringusinbyName.AutowiringusinbyName_SpringBeanFactory_10;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	  public static void main(String[] args) {
	  
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	    IPayService bean = (IPayService) context.getBean("payServiceBean");
	    bean.performPayment();
	 
	  }
	}