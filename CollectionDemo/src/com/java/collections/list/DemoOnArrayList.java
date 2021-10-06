package com.java.collections.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class DemoOnArrayList {
	
//	add
//	replace using set
//	remove
//	addall-one list to other
//	search using contain
// size
//Iteration
//sort---Collections.sort(list3);
	//Iterator
	

	public static void main(String[] args) {
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i=10;i<=100;i=i+10)
		{
			list2.add(i);
		
		}
		System.out.println(list2);
		List<Integer> list3 = new ArrayList<>();
		list3.add(900);
		list3.add(500);
		list3.add(789);
		list3.add(400);
		list3.add(400);
		list3.add(400);
		list3.add(123);
		list3.add(678);
		System.out.println(list3);
		Collections.sort(list3);
		
		System.out.println(list3);
		for(int a : list3)
		{
			System.out.println(a);
			
		}
		
		list3.addAll(1, list2);
		System.out.println(list3);
		if(list2.contains(30))
		{
			System.out.println("yes tere");
		}
		else
		{
			System.out.println("no");
		}
		System.out.println("list3 size"+list3.size());
		Iterator<Integer> obj = list3.iterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
		
	}
	
}
