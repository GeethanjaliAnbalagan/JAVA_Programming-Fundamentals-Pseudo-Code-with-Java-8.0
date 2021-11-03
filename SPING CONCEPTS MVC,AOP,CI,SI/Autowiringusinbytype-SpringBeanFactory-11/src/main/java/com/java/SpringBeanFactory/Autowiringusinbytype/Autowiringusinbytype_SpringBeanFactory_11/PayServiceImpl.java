package com.java.SpringBeanFactory.Autowiringusinbytype.Autowiringusinbytype_SpringBeanFactory_11;

public class PayServiceImpl implements IPayService {
	  private IPayment payment;
	  private int amount;

	  public void performPayment() {
	    // calling payment class executePayment method
	    payment.executePayment(amount);
	  }

	  public IPayment getPayment() {
	    return payment;
	  }


	  public void setPayment(IPayment payment) {
	    this.payment = payment;
	  }

	  public int getAmount() {
	    return amount;
	  }

	  public void setAmount(int amount) {
	    this.amount = amount;
	  }
	}