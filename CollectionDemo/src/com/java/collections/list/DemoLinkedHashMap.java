package com.java.collections.list;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class DemoLinkedHashMap {
	    public static void main(String args[]) {
	         // HashMap Declaration
	         LinkedHashMap<Integer, String> lhmap = 
	                 new LinkedHashMap<Integer, String>();

	         //Adding elements to LinkedHashMap
	         lhmap.put(22, "Abey");
	         lhmap.put(33, "Dawn");
	         lhmap.put(1, "Sherry");
	         lhmap.put(2, "Karon");
	         lhmap.put(100, "Jim");

	         // Generating a Set of entries
	         Set set = lhmap.entrySet();

	         // Displaying elements of LinkedHashMap
	         Iterator iterator = set.iterator();
	         while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
	            System.out.print("Key is: "+ me.getKey() +"& Value is: "+me.getValue()+"\n");
	        	//System.out.println(iterator.next()); 
	         }
	         


	    }
	}


