package com.java.collections.list;
import java.util.*;
//descending order
//.pollFirst()
//SortedSetSet operations.
public class DemoTreeSet {
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(50);
		set.add(20);
		set.add(10);
		set.add(80);
		set.add(143);
		//set.add(143);
		//set.add(20);
		
		System.out.println(set);
		/*Iterator<Integer> i = set.descendingIterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		  System.out.println("Lowest Value: "+set.pollFirst());  
	         System.out.println("Highest Value: "+set.pollLast()); 
	         
	         TreeSet<String> set1=new TreeSet<String>();  
	         set1.add("A");  
	         set1.add("B");  
	         set1.add("C");  
	         set1.add("D");  
	         set1.add("E");  
	           
	         System.out.println("Intial Set: "+set1);  
	           
	         System.out.println("Head Set: "+set1.headSet("C"));  
	          
	         System.out.println("SubSet: "+set1.subSet("A", "E"));  
	           
	         System.out.println("TailSet: "+set1.tailSet("C"));  */
	}

}
