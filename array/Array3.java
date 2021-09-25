package com.java.array;

               //*********Multidimensional Arrays in Java*****************
/*
 SYNTAX:
 data_type[1st dimension][2nd dimension][]..[Nth dimension] array_name = new data_type[size1][size2]….[sizeN];
 
 Two dimensional array:
int[][] twoD_arr = new int[10][20];

Three dimensional array:
int[][][] threeD_arr = new int[10][20][30];
Size of multidimensional arrays: The total number of elements that can be stored in a multidimensional array can be calculated by multiplying the size of all the dimensions.

For example:
The array int[][] x = new int[10][20] can store a total of (10*20) = 200 elements.
Similarly, array int[][][] x = new int[5][10][20] can store a total of (5*10*20) = 1000 elements.



The elements of a 2D array are arranged in rows and columns, and the new operator for 2D arrays specifies both the number of rows and the number of columns. For example,

int[][] A;
A = new int[3][4];
This creates a 2D array of int that has 12 elements arranged in 3 rows and 4 columns. 




 
 */

/*
 // SAMPLE
public class Array3 {

		public static void main(String[] args)
		{

			int[][] arr = new int[10][20];
			arr[0][0] = 1;

			System.out.println("arr[0][0] = " + arr[0][0]);
		}
	}


 
		 
//LOOOPING TO DISPLAY ELEMENTS
 
public class Array3 {
	public static void main(String[] args)
	{

		int[][] arr = { { 1, 2 }, { 3, 4 } };

		for (int i = 0; i < 2; i++)		  					
			for (int j = 0; j < 2; j++)
				System.out.println("arr[" + i + "][" + j + "] = "
								+ arr[i][j]);                                
	}
}


 
 //Print 2D array in tabular format:
  
  public class Array3 {
	public static void main(String[] args)
	{

		int[][] arr = { { 1, 2 }, { 3, 4 } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
	}

*/
 
 
 
 
 
 
 
 
 
 


	
