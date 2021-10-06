package com.java.collections;
import java.util.*;
//add
//replace using set
//remove
//addall-one list to other
//search using contain
//size
//Iteration
//sort---Collections.sort(list3);
//Iterator
public class DemoCollection {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		
		List<String> list1 = new ArrayList<>();
		list.add(990);
	
	
		for(int i=10;i<=100;i=i+10)
		{
			list.add(i);
			System.out.println(i);
			System.out.println(list);
			System.out.println(list.add(i));
		}
		System.out.println(list);
		list1.add("geetha");
		list1.add("sanjith");
	
		System.out.println(list1);
		
		

		
		
	}

}
