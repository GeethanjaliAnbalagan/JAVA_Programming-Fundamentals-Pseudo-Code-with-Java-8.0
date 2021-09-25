package javaf;

public class PatternExercise
{
  public static void main(String args[]) 
  {
      int n = 5;  // Number of rows.
 
      //Outer Loop for number of Rows
      for(int i=0;i<n;i++)
      {
          for(int k=i;k<n;k++)
          System.out.print(" ");
 
          // printing '*' in each column.
          for(int j=0;j<=i;j++)
          {
            // We print '*' for each row.
            System.out.print("* ");
          }
 
          System.out.println();
      }
  }
}    
	  
	  
	  
	  