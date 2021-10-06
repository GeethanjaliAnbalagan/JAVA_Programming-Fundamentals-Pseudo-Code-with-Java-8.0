package com.java.collections.list;

import java.util.*;

	public class ArrayListMain {
	    public static void main(String[] args) {
	        ArrayList<String> arrList = new ArrayList<>();

	        Scanner in = new Scanner(System.in); // create a scancer object to take user input
	        int n = 5; // take 5 input from user
	        String userInput;
	        for(int i = 0; i<n; i++){

	            userInput = in.nextLine(); // use nextLine() to take string input from user
	            arrList.add(userInput); // add the string to our Array List
	        }

	        System.out.println(arrList); // print the array list
	    }
	}
		
		
		
		
	

