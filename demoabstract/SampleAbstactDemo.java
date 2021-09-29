package com.java.demoabstract;

public class SampleAbstactDemo {
	public static void main(String[] args) 
	{
	//MyTest	d = new MyTest();
	Addition a = new Addition();
	Subtration b = new Subtration();
	Mutiplication c = new Mutiplication();
	a.calculate(30, 50);
	b.calculate(50, 10);
	c.calculate(20, 50);
	a.sum();
	}
}
