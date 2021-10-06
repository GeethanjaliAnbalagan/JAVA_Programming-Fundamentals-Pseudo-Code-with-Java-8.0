package com.java.collections.list;
import java.awt.List;
import java.util.*;
//Adding elements to the HashSet
//Addition of duplicate elements
//Addition of null values
//iterator
//remove //Removing all the new elements from HashSet--set.removeAll(set1); 
//Removing all the elements available in the set--set.clear(); 
//Java HashSet from another Collection

public class DemoHashSet {
public static void main(String[] args) {
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	
	list2.add(66);
	list2.add(75);
	
	HashSet<Integer> var = new HashSet<Integer>(list2);
	Set<String> set1 = new HashSet<String>();
	var.add(20);
	var.add(10);
	var.add(40);
	var.add(null);
	var.add(null);
	System.out.println(var);
	var.remove(20);
	System.out.println(var);
	//var.removeAll(var);
	//System.out.println(var);
	Iterator<Integer> ib = var.iterator();
	while(ib.hasNext())
	{
		System.out.println(ib.next());
	}
	
	//var.clear();
	 /*Iterator<Integer> i =var.iterator();  
     while(i.hasNext())  
     {  
     System.out.println(i.next());  
     }  
	var.add(10);
	System.out.println(var);
	var.add(null);
	
	System.out.println(var);
	var.remove(10);
	System.out.println(var);
	Iterator<Integer> ib = var.iterator();
	while(ib.hasNext())
	{
		System.out.println(ib.next());
	}
	var.clear();*/
	
}
}
