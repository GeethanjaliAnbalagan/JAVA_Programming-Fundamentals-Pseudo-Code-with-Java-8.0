package com.java.strings;

/*
 StringBuilder: 
The StringBuilder in Java represents a mutable sequence of characters. 
Since the String Class in Java creates an immutable sequence of characters, 
the StringBuilder class provides an alternate to String Class, as it creates a mutable sequence of characters.
 */


	// Java code to illustrate StringBuilder

	import java.util.*;
	import java.util.concurrent.LinkedBlockingQueue;

	public class String12345 {
		public static void main(String[] argv)
			throws Exception
		{

			// create a StringBuilder object
			// usind StringBuilder() constructor
			StringBuilder str
				= new StringBuilder();

			str.append("GFG");

			// print string
			System.out.println("String = "
							+ str.toString());

			// create a StringBuilder object
			// usind StringBuilder(CharSequence) constructor
			StringBuilder str1
				= new StringBuilder("AAAABBBCCCC");

			// print string
			System.out.println("String1 = "
							+ str1.toString());

			// create a StringBuilder object
			// usind StringBuilder(capacity) constructor
			StringBuilder str2
				= new StringBuilder(10);

			// print string
			System.out.println("String2 capacity = "
							+ str2.capacity());

			// create a StringBuilder object
			// usind StringBuilder(String) constructor
			StringBuilder str3
				= new StringBuilder(str1.toString());

			// print string
			System.out.println("String3 = "
							+ str3.toString());
		}
	}

/*
 //StringTokenizer: StringTokenizer class in Java is used to break a string into tokens.
 //A Java program to illustrate working of StringTokenizer
class:
	
	
import java.util.*;
public class String12345 {
{
	public static void main(String args[])
	{
		System.out.println("Using Constructor 1 - ");
		StringTokenizer st1 =
			new StringTokenizer("Hello Geeks How are you", " ");
		while (st1.hasMoreTokens())
			System.out.println(st1.nextToken());

		System.out.println("Using Constructor 2 - ");
		StringTokenizer st2 =
			new StringTokenizer("JAVA : Code : String", " :");
		while (st2.hasMoreTokens())
			System.out.println(st2.nextToken());

		System.out.println("Using Constructor 3 - ");
		StringTokenizer st3 =
			new StringTokenizer("JAVA : Code : String", " :", true);
		while (st3.hasMoreTokens())
			System.out.println(st3.nextToken());
	}
}

    
 */

