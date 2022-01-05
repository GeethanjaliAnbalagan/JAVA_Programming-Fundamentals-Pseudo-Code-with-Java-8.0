package com.java.CatchException;

	// Java Program to Illustrate Checked Exceptions
	// Where FileNotFoundException occured

	// Importing I/O classes
	import java.io.*;

	// Main class
	public class WithCatchException {

		// Main driver method
		public static void main(String[] args)
		{

			// Reading file from path in local directory
			FileReader file = new FileReader("D:\\sam-eclipse\\Exceptionhandling\\src\\com\\java\\CatchException\\a.txt");

			// Creating object as one of ways of taking input
			BufferedReader fileInput = new BufferedReader(file);

			// Printing first 3 lines of file "C:\test\a.txt"
			for (int counter = 0; counter < 3; counter++)
				System.out.println(fileInput.readLine());

			// Closing file connections
			// using close() method
			fileInput.close();
		}
	}
