package com.java.collections.list;

import java.util.*;
//Adding an element to the first position
//Adding an element to the last position
//Adding an element to the 3rd position
//Iterating LinkedList
//Removing First element
//Same as list.remove(0);
//Removing Last element
//search using contain

public class DemoOnLinkedList {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		
		for(int i=10;i<=100;i=i+10)
		{
		list.add(i);
		}
		System.out.println(list);
		list.addFirst(200);
		System.out.println(list);
		list.addLast(450);
		System.out.println(list);
		list.add(2,345);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		if(list.contains(30))
		{
			System.out.println("yes");
		}
		System.out.println(list);
//		Iterator<Integer> obj = list.iterator();
//		while(obj.hasNext())
//		{
//			System.out.println(obj.next());
//		}
		Iterator<Integer> var = list.iterator();
		while(var.hasNext())
		{
			
			System.out.println(var.next());
		}
		
		
		
	}

}

























