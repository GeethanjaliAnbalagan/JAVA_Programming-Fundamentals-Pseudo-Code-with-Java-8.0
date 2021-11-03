package com.java.SpringBeanFactory.Autowiringusinbytype.Autowiringusinbytype_SpringBeanFactory_11;

public class CreditPayment implements IPayment {
	 public void executePayment(int amount) {
	  System.out.println("Perform Credit Payment for amount ... " + amount);
	 }
	}
