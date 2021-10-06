package com.java.collections.list;
import java.util.*;
public class HashsetSample {
	
	public static void main(String[] args) {
		
		HashSet<String> obj = new HashSet<String>();
		obj.add("geetha");
		obj.add("geetha-1");
		obj.add("geetha-2");
		obj.add("geetha-3");
		obj.add("geetha-4");
		obj.add("geetha");
		obj.add("geetha");
		System.out.println(obj);
		HashSet clone = new HashSet();
		clone =(HashSet)obj.clone();
		System.out.println(clone);
		
	}

}
