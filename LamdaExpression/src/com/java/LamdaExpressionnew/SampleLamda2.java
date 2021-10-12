package com.java.LamdaExpressionnew;

	import java.util.ArrayList;
	import java.util.function.Consumer;
	public class SampleLamda2 {
	  public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(8);
	    numbers.add(7);
	    numbers.add(8);
	    numbers.add(1);
	    Consumer<Integer> method = (n) -> { System.out.println(n); };
	    numbers.forEach( method );
	  //  numbers.forEach( (n) -> { System.out.println(n); };);
	  }
	}
