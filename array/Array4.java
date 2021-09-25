package com.java.array;

/*Three – dimensional Array (3D-Array)
Three – dimensional array is a complex form of a multidimensional array. A three – dimensional array can be seen as an array of two – dimensional array for easier understanding.

Indirect Method of Declaration:

Declaration – Syntax:
data_type[][][] array_name = new data_type[x][y][z];
        For example: int[][][] arr = new int[10][20][30];
        
Initialization – Syntax:
array_name[array_index][row_index][column_index] = value;
        For example: arr[0][0][0] = 1;
        
        
        
        
        */

public class Array4 {

	
		public static void main(String[] args)
		{

			int[][][] arr = new int[10][20][30];
			arr[0][0][0] = 1;

			System.out.println("arr[0][0][0] = " + arr[0][0][0]);
		}
	}


/*
 
 // DISPLAY ELEMENTS
 public class Array4 {
	public static void main(String[] args)
	{

		int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				for (int z = 0; z < 2; z++)
					System.out.println("arr[" + i
									+ "]["
									+ j + "]["
									+ z + "] = "
									+ arr[i][j][z]);
	}
}



//Print 3D array in tabular format:

public class Array4 {
	public static void main(String[] args)
	{

		int[][][] arr = { { { 1, 2 }, { 3, 4 } },
						{ { 5, 6 }, { 7, 8 } } };

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				for (int k = 0; k < 2; k++) {

					System.out.print(arr[i][j][k] + " ");
				}

				System.out.println();
			}
			System.out.println();
		}
	}
}

 
 
 
 
 */


