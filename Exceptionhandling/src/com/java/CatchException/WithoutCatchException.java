package com.java.CatchException;



	// Java Program to Illustrate Checked Exceptions
	// Where FileNotFoundException does not occur

	// Importing I/O classes
	import java.io.*;

	// Main class
	public class WithoutCatchException {

		// Main driver method
		public static void main(String[] args)
			throws IOException
		{

			// Creating a file and reading from local repository
			FileReader file = new FileReader("D:\\sam-eclipse\\Exceptionhandling\\src\\com\\java\\CatchException\\a.txt");

			// Reading content inside a file
			BufferedReader fileInput = new BufferedReader(file);

			// Printing first 3 lines of file "C:\test\a.txt"
			for (int counter = 0; counter < 3; counter++)
				System.out.println(fileInput.readLine());

			// Closing all file connections
			// using close() method
			// Good practice to avoid any memory leakage
			fileInput.close();
		}
	}

