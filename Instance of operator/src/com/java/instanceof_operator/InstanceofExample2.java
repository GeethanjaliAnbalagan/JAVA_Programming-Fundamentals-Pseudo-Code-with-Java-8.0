package com.java.instanceof_operator;


	import java.util.AbstractList;
	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.LinkedList;
	import java.util.List;
	 
	@SuppressWarnings("unused")
	public class InstanceofExample2 {
	    public static void main(String[] args) 
	    {
	        int[] intArr = new int[3];
	        float[] floatArr = new float[3];
	        
	        
	        
	        Integer[] intObjArr = new Integer[3];
	        Float[] floatObjArr = new Float[3];
	        String[] stringArr = new String[3];
	         
	        System.out.println(intArr instanceof Object);       //true
	        System.out.println(intArr instanceof int[]);        //true
	       // System.out.println(intArr instanceof float[]);      //false
	         
	        System.out.println(floatArr instanceof Object);     //true
	        System.out.println(floatArr instanceof float[]);    //true
	         
	        System.out.println(intObjArr instanceof Object);    //true
	        System.out.println(intObjArr instanceof Object[]);  //true
	        System.out.println(intObjArr instanceof Integer[]); //true
	        System.out.println(intObjArr instanceof Number[]);  //true
	         
	        System.out.println(floatObjArr instanceof Float[]); //true
	        System.out.println(stringArr instanceof String[]);  //true
	    }
	}
