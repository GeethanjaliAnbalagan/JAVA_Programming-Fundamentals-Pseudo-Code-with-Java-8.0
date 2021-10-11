package com.java.collections.map;

import java.util.*;

//import java.util.HashMap;
public class HashmapSample {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(105, "abcd");
		hmap.put(207, "abcd-1");
		hmap.put(110, "abcd-2");
		hmap.put(103, "abcd-3");
		hmap.put(105, "abcd");
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.println("key is: " + mentry.getKey() + " & value is");
			System.out.println(mentry.getValue());
		}
		String var = hmap.get(104);
		System.out.println(var);
		hmap.remove(105);
		Set set1 = hmap.entrySet();
		Iterator iterator1 = set1.iterator();
		while (iterator1.hasNext()) {
			Map.Entry mentry1 = (Map.Entry) iterator1.next();
			System.out.println("key is: " + mentry1.getKey() + " & value is");
			System.out.println(mentry1.getValue());
		}

	}

}
