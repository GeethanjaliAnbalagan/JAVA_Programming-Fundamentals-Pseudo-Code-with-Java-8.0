package com.java.strings;

public class Allstring {
	// Java program to demonstrate difference
	// between String, StringBuilder and StringBuffer
	class Geeksforgeeks {
	    // Concatenates to String
	    public static void concat1(String s1)
	    {
	        s1 = s1 + "forgeeks";
	    }
	 
	    // Concatenates to StringBuilder
	    public static void concat2(StringBuilder s2)
	    {
	        s2.append("forgeeks");
	    }
	 
	    // Concatenates to StringBuffer
	    public static void concat3(StringBuffer s3)
	    {
	        s3.append("forgeeks");
	    }
	 
	    public static void main(String[] args)
	    {
	        String s1 = "Geeks";
	 
	        // s1 is not changed
	        concat1(s1);
	        System.out.println("String: " + s1);
	 
	        StringBuilder s2 = new StringBuilder("Geeks");
	 
	        // s2 is changed
	        concat2(s2);
	        System.out.println("StringBuilder: " + s2);
	 
	        StringBuffer s3 = new StringBuffer("Geeks");
	 
	        // s3 is changed
	        concat3(s3);
	        System.out.println("StringBuffer: " + s3);
	    }
	}

}
