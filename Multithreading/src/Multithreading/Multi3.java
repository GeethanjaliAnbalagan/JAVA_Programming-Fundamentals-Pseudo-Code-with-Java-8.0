package Multithreading;
//Can we start a thread twice
public class Multi3 extends Thread{  
	 public void run(){  
	   System.out.println("running...");  
	 }  
	 public static void main(String args[]){  
		 Multi3 t1=new Multi3();  
	  t1.start();  
	  t1.start();  
	 }  
	}  