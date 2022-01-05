package Exceptionhandling;

class TestFinallyBlock1{  
	  public static void main(String args[]){  
	  try{  
	   int data=25/0;  
	   System.out.println(data);  
	  }  
	  catch(NullPointerException e)
	  {
		  System.out.println(e);
		  }  
	  finally
	  {
		  System.out.println("Try catch block is always executed");
		  }  
	  System.out.println("rest of the code...");  
	  }  
	}  