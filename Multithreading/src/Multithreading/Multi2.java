package Multithreading;
//Example of sleep method in java
class Multi2 extends Thread{  
	 public void run()
	 {  
	  for(int i=1;i<5;i++)
	  {  
	    try{
	    
	    	Thread.sleep(5000);                      //t1 to awake 1 t1 awake 2 t1 3 t1 4     t2 awake 1 t2 awake 2 t2 3 t2 4
	    }
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    	}  
	        System.out.println(i);  
	  }  
	 }  
	 public static void main(String args[])
	 {  
		 Multi2 t1=new Multi2();  
		 Multi2 t2=new Multi2();  
	   
	  t1.start();  
	  t2.start();  
	 }  
	}  