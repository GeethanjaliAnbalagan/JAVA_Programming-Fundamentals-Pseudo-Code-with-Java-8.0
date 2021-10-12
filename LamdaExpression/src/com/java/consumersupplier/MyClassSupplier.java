package com.java.consumersupplier;



public class MyClassSupplier {
	public static void main(String[] args) {
		
	
		 Supplier<Integer> supplierInteger = () -> 50;
		  System.out.println(supplierInteger.get());

		  Supplier<String> supplierString = () -> "Soumitra";
		  System.out.println(supplierString.get());

		
	}
}