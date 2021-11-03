package com.java.SpringBeanFactory.AutowiringusinbyName.AutowiringusinbyName_SpringBeanFactory_10;

public class CashPayment implements IPayment{
	 public void executePayment(int amount) {
	  System.out.println("Perform Cash Payment for amount ... " + amount); 
	 }
	}
