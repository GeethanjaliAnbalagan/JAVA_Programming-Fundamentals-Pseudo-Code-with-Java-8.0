package com.java.SpringBeanFactory.Autowiringusinbytype.Autowiringusinbytype_SpringBeanFactory_11;

public class CashPayment implements IPayment{
	 public void executePayment(int amount) {
	  System.out.println("Perform Cash Payment for amount ... " + amount); 
	 }
	}
