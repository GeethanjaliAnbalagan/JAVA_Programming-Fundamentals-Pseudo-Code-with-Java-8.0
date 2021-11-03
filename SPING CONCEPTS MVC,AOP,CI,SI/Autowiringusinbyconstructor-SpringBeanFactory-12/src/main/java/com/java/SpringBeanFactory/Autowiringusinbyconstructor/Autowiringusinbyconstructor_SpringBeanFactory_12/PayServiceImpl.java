package com.java.SpringBeanFactory.Autowiringusinbyconstructor.Autowiringusinbyconstructor_SpringBeanFactory_12;

public class PayServiceImpl implements IPayService {
	 private IPayment payment;
	 private int amount;
	 
	 // Constructor
	 PayServiceImpl(IPayment payment){
	   this.payment = payment;
	 }
	  
	 public void performPayment() {
	  // calling payment class executePayment method
	  payment.executePayment(amount);
	 }

	 public int getAmount() {
	  return amount;
	 }

	 public void setAmount(int amount) {
	  this.amount = amount;
	 }
	}