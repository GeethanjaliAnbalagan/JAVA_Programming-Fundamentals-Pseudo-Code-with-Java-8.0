package Exceptionhandling;

import java.io.*;  
class N{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
class Testthrows4{  
   public static void main(String args[])throws IOException{//declare exception  
     N m=new N();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}  
