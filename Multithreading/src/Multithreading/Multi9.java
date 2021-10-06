package Multithreading;

//Java program to demonstrate impact 
//of Parallel Sort vs Serial Sort 

import java.util.Arrays; 
import java.util.Random; 

public class Multi9 { 
	public static void main(String[] args) 
	{ 
		// Creating an array 
		int numbers[] = new int[100]; 

		// Iterating Loop till i = 1000 
		// with interval of 10 
		for (int i = 0; i < 1000; i += 10) { 

			System.out.println("\nFor iteration number: "
							+ (i / 10 + 1)); 

			// Random Int Array Generation 
			Random rand = new Random(); 

			for (int j = 0; j < 100; j++) { 
				numbers[j] = rand.nextInt(); 
			} 

			// Start and End Time of Arrays.sort() 
			long startTime = System.nanoTime(); 

			// Performing Serial Sort 
			Arrays.sort(numbers); 

			long endTime = System.nanoTime(); 

			// Printing result of Serial Sort 
			System.out.println("Start and End Time in Serial (in ns): "
							+ startTime + ":" + endTime); 
			System.out.println("Time taken by Serial Sort(in ns): "
							+ (endTime - startTime)); 

			// Start and End Time of Arrays.parallelSort() 
			startTime = System.nanoTime(); 

			// Performing Parallel Sort 
			Arrays.parallelSort(numbers); 

			endTime = System.nanoTime(); 

			// Printing result of Parallel Sort 
			System.out.println("Start and End Time in parallel (in ns): "
							+ startTime + ":" + endTime); 
			System.out.println("Time taken by Parallel Sort(in ns): "
							+ (endTime - startTime)); 
			System.out.println(); 
		} 
	} 
} 
