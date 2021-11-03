package com.java.SpringBeanFactory.Autowiringusinbyconstructor.Autowiringusinbyconstructor_SpringBeanFactory_12;

public class CashPayment implements IPayment{
	 public void executePayment(int amount) {
	  System.out.println("Perform Cash Payment for amount ... " + amount); 
	 }
	}
