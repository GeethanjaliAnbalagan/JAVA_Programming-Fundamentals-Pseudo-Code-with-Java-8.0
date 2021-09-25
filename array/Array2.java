package com.java.array;

               //********* DIFFERENT METHODS IN ARRAY *****************



//asList() - Returns a fixed-size list backed by the specified Arrays


	
	// Java Program to Demonstrate Arrays Class
	// Via asList() method

	// Importing Arrays utility class
	// from java.util package
	import java.util.Arrays;
/*
	// Main class
	public class Array2 {

		// Main driver method
		public static void main(String[] args)
		{
			// Get the Array
			int intArr[] = { 10, 20, 15, 22, 35 };

			// To convert the elements as List
			System.out.println("Integer Array as List: "
							+ Arrays.asList(intArr));
							
			
		}
	}


*/
//binarySearch() Method - Searches for the specified element in the array with the help of the Binary Search Algorithm


// Java Program to Demonstrate Arrays Class
// Via binarySearch() method

// Importing Arrays utility class
// from java.util package
import java.util.Arrays;

// Main class
public class Array2 {

	// Main driver method
	public static void main(String[] args)
	{

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		Arrays.sort(intArr);
		

		int intKey = 22;

		// Print the key and corresponding index
		System.out.println(
			intKey + " found at index = "
			+ Arrays.binarySearch(intArr, intKey));
	} }


/*
//copyOf(originalArray, newLength)	Copies the specified array, truncating or padding with the 
// default value (if necessary) so the copy has the specified length.
 
  // Java program to demonstrate
// Arrays.copyOf() method

//import java.util.Arrays;

public class Array2 {
	public static void main(String[] args)
	{

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		// To print the elements in one line
		System.out.println("Integer Array: "
						+ Arrays.toString(intArr));

		System.out.println("\nNew Arrays by copyOf:\n");

		System.out.println("Integer Array: "
						+ Arrays.toString(
								Arrays.copyOf(intArr, 20)));
		
		System.out.println(intArr.length);
	
		
	}
}

 
 */



