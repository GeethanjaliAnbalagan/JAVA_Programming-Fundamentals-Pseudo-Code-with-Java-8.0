package com.java.strings;


          //**************Strings in Java********************



/*
 Strings in Java are Objects that are backed internally by a char array. Since arrays are immutable(cannot grow), Strings are immutable as well. Whenever a change to a String is made, an entirely new String is created. 

Syntax:  

<String_Type> <string_variable> = "<sequence_of_string>"; 

Memory allotment of String

Whenever a String Object is created as a literal, the object will be created in String constant pool. This allows JVM to optimize the initialization of String literal.

 */

/*
	
	// Java code to illustrate String
	import java.io.*;
	import java.lang.*;

	public class Strings123 {
		public static void main(String[] args)
		{
			// Declare String without using new operator
			String s = "Gethanjali";
                                           //  char[] ch = {'g','e','t'};
												//String s = new String(ch);
			// Prints the String.
			System.out.println("String s = " + s);

			// Declare String using new operator
			String s1 = new String("Sanjith");

			// Prints the String.
			System.out.println("String s1 = " + s1);
		}
	}



//Get length of a String
public class Strings123 {
 public static void main(String[] args) {

    // create a string
    String greet = "Hello! World";
    System.out.println("String: " + greet);

    // get the length of greet
    int length = greet.length();
   
    System.out.println("Length: " + length);
  }
}



//Join Two Java Strings
 public class Strings123 {
  public static void main(String[] args) {

    // create first string
    String first = "Java ";
    System.out.println("First String: " + first);

    // create second
    String second = "Programming";
    System.out.println("Second String: " + second);

    // join two strings
    String joinedString = first.concat(second);
    System.out.println("Joined String: " + joinedString);
  }
}
*/

//Compare two Strings
 
 public class Strings123 {
  public static void main(String[] args) {

    // create 3 strings
    String first = "java programming";
    String second = "java programming";
    String third = "python programming";

    // compare first and second strings
    boolean result1 = first.equals(second);
    System.out.println("Strings first and second are equal: " + result1);

    // compare first and third strings
    boolean result2 = first.equals(third);
    System.out.println("Strings first and third are equal: " + result2);
  }
}



