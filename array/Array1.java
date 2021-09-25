package com.java.array;

             //**********ARRAYS BASICS*************
                                                                                      
// Initialize Arrays in integer and Access it

public class Array1 {
	 public static void main(String[] args) {                                         
		  
		   // create an array
		   int[] age = {12, 4, 5, 2, 5};

		   // access each array elements
		   System.out.println("Accessing Elements of Array:");
		   System.out.println("First Element: " + age[0]);
		   System.out.println("Second Element: " + age[1]);
		   System.out.println("Third Element: " + age[2]);
		   System.out.println("Fourth Element: " + age[3]);
		   System.out.println("Fifth Element: " + age[4]);
		 }
		}


/*

 // Initialize Arrays in String and Access it and length
public class Array1 {
 public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(cars[0]);
    System.out.println(cars.length);
  }
}



// Looping Through Array Elements
//Initialize Arrays in integer and Access it
public class Array1 {
	public static void main(String[] args) {
		  
		   // create an array
		   int[] age = {12, 4, 5};

		   // loop through the array
		   // using for loop
		   System.out.println("Using for Loop:");
		   for(int i = 0; i < age.length; i++) {                   
		     System.out.println(age[i]);
		   }
		 }
		}


//Using the for-each Loop
public class Array1 {
public static void main(String[] args) {
  
   // create an array
   int[] age = {12, 4, 5};

   // loop through the array
   // using for loop
   System.out.println("Using for-each Loop:");
   for(int a : age) {
     System.out.println(a);
   }
 }
}



//Compute Sum and Average of Array Elements
 public class Array1 {
 public static void main(String[] args) {

   int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
   int sum = 0;
   Double average;
   
   // access all elements using for each loop
   // add each element in sum
   for (int number: numbers) {
     sum += number;// sum = sum + number;
   }
  
   // get the total number of elements
   int arrayLength = numbers.length;

   // calculate the average
   // convert the average from int to double
   average =  ((double)sum / (double)arrayLength);

   System.out.println("Sum = " + sum);
   System.out.println("Average = " + average);
 }
}
 */
