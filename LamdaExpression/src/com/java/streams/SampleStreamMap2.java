package com.java.streams;


	// Java code for Stream map(Function mapper)
	// to get a stream by applying the
	// given function to this stream.
	import java.util.*;
	import java.util.stream.Collectors;

	public class SampleStreamMap2 {


		// Driver code
		public static void main(String[] args)
		{

			System.out.println("The stream after applying "
							+ "the function is : ");

			// Creating a list of Integers
			List<String> list = Arrays.asList("Hi guys", "gfg", "g",
											"e", "e", "t", "h");

			// Using Stream map(Function mapper) to
			// convert the Strings in stream to
			// UpperCase form
			List<String> answer = list.stream().map(String::toUpperCase).collect(Collectors.toList());

			// displaying the new stream of UpperCase Strings
			System.out.println(answer);
		}
	}

