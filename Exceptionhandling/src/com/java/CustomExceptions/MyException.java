package com.java.CustomExceptions;

class MyException extends Exception{ 
	 String str1;
	 MyException(String str2) {str1=str2;}
	  public String toString(){
	   return ("MyException Occurred: "+str1);
	 }
	}
	