package Multithreading;

//What if we call run() method directly instead start() method?

class Multi4 extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try{
	    	Thread.sleep(5000);
	    	}
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);}  
	    System.out.println(i);  
	  }  
	 }  
	 public static void main(String args[]){  
	  Multi4 t1=new Multi4();  
	  Multi4 t2=new Multi4();  
	 //  t1.start();
	 //  t2.start();
	  t1.run();  
	  t2.run();  
	 }  
	}  
//As you can see in the above program that there is no context-switching because here t1 and t2 
//will be treated as normal object not thread object.