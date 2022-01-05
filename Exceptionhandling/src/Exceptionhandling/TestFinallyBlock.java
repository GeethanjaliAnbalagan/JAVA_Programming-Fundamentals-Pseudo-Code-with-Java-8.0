package Exceptionhandling;

//the java finally example where exception doesn't occur.
class TestFinallyBlock{  
	  public static void main(String args[]){  
	  try{  
	   int data=25/0;  
	   System.out.println(data);  
	  }  
	  catch(Exception e){
		  System.out.println(e);}  
	  finally{
		  System.out.println("finally block is always executed");
		  }  
	  System.out.println("rest of the code...");  
	  }  
	}  
