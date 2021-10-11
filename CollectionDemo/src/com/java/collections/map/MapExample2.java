package com.java.collections.map;

import java.util.*;  
class MapExample2{  
 public static void main(String args[]){  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Amit");  
  map.put(201,"Vijay");  
  map.put(302,"Rahul"); 
  map.put(1,"Rahul-1"); 
  map.put(2,"Rahul-2"); 
  map.put(3,"Rahul-3"); 
  //Elements can traverse in any order  
  for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  