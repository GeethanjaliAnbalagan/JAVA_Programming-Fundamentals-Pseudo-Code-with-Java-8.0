package com.java.SpringBeanFactory.Autowiringusinbyconstructor.Autowiringusinbyconstructor_SpringBeanFactory_12;

public class CreditPayment implements IPayment {
	 public void executePayment(int amount) {
	  System.out.println("Perform Credit Payment for amount ... " + amount);
	 }
	}
