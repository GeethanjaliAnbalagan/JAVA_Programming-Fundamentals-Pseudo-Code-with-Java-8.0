package Multithreading;

class Multi6 extends Thread{  
	  public void run(){  
	   System.out.println("running...");  
	  }  
	 public static void main(String args[]){  
		 Multi6 t1=new Multi6();  
		 Multi6 t2=new Multi6();  
	  System.out.println("Name of t1:"+t1.getName());  
	  System.out.println("Name of t2:"+t2.getName());     
	  t1.start();  
	  t2.start();  
	  t1.setName("Anjali Thread");  
	  System.out.println("After changing name of t1:"+t1.getName());  
	 }  
	}  