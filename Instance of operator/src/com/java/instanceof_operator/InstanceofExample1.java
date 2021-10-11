package com.java.instanceof_operator;
	import java.util.AbstractList;
	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.LinkedList;
	import java.util.List;
	 
	public class InstanceofExample1 {
	    public static void main(String[] args) 
	    {
	        ArrayList<String> arrayList = new ArrayList<>();
	         
	        System.out.println(arrayList instanceof ArrayList);     //true
	         
	        System.out.println(arrayList instanceof AbstractList);  //true
	         
	        System.out.println(arrayList instanceof List);          //true
	         
	        System.out.println(arrayList instanceof Collection);    //true
	         
	        System.out.println(null instanceof ArrayList);          //false
	         
	       //System.out.println(arrayList instanceof LinkedList);  //Does not compile
	    }
	}
