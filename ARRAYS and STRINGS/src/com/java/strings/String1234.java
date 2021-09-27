package com.java.strings;

                 //********StringBuffer class in Java***************

/* 
 StringBuffer is a peer class of String that provides much of the functionality of strings. String represents fixed-length,
  immutable character sequences while StringBuffer represents growable and writable character sequences.

StringBuffer may have characters and substrings inserted in the middle or appended to the end. It will automatically
 grow to make room for such additions and often has more characters preallocated than are actually needed, to allow room for growth.

StringBuffer Constructors

StringBuffer( ): It reserves room for 16 characters without reallocation.

StringBuffer s=new StringBuffer();
StringBuffer( int size)It accepts an integer argument that explicitly sets the size of the buffer.

StringBuffer s=new StringBuffer(20);
StringBuffer(String str): It accepts a String argument that sets the initial contents of the StringBuffer object and 
reserves room for 16 more characters without reallocation.

StringBuffer s=new StringBuffer("Geethanjali");


 
 */

//length( ) and capacity( ): The length of a StringBuffer can be found by the length( ) method, while the total allocated capacity 
//can be found by the capacity( ) method.
/*

	import java.io.*;
	public class String1234 {
		public static void main(String[] args)
		{
			StringBuffer s1 = new StringBuffer();
			System.out.println(s1.capacity());
			StringBuffer s = new StringBuffer("Geethanjali");
			int p = s.length();
			int q = s.capacity();
			
			System.out.println("Length of string Geethanjali=" + p);
			System.out.println("Capacity of string Geethanjali=" + q);
		}
	}



//append( ): It is used to add text at the end of the existence text. Here are a few of its forms:
//StringBuffer append(String str)
//StringBuffer append(int num)
public class String1234 {
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer("Geethanjali");
		s.append("students");
		System.out.println(s); // returns Geethanjalistudents
		s.append(1);
		System.out.println(s); // returns Geethanjalistdents1
	}
}

*/
//insert( ): It is used to insert text at the specified index position. These are a few of its forms:
//StringBuffer insert(int index, String str)
//StringBuffer insert(int index, char ch)
//Here, index specifies the index at which point the string will be inserted into the invoking StringBuffer object.
 
 import java.io.*;
public class String1234{
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer("java program");
		System.out.println("GeeksGeeks");
		s.insert(5, "for");
		System.out.println(s); 

		s.insert(0, 5);
		System.out.println(s); 

		s.insert(3, true);
		System.out.println(s); 

		s.insert(5, 41.35d);
		System.out.println(s); 

		s.insert(8, 41.35f);
		System.out.println(s); 

		char geeks_arr[] = { 'p', 'a', 'w', 'a', 'n' };

		
		s.insert(2, geeks_arr);
		System.out.println(s); 
	}
}
/*
//reverse( ): It can reverse the characters within a StringBuffer object using reverse( ).
//This method returns the reversed object on which it was called. 
 
 import java.io.*;
public class String1234{
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer("Welcome");
		s.reverse();
		System.out.println(s); // returns skeeGrofskeeG
	}
}
*/
