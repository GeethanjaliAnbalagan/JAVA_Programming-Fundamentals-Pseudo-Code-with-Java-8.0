package com.java.timecalculation;

public class FirstThread implements Runnable{
	 
	 public void run()
	 {
	  System.out.println("Thread is running");
	 /* for (int i = 1; i < 5; i++) {
		  long startTime=System.currentTimeMillis();
		  try {
		                // putting thread on sleep
		   Thread.sleep(5000);
		  } catch (InterruptedException e) {
		   e.printStackTrace();
		  }
		  
			
		  long endTime=System.currentTimeMillis();
		  long timeDifference=(endTime-startTime);
		  System.out.println("Time difference between before and after sleep call THREAD-1: "+timeDifference);
		  System.out.println(i);
		  }
		*/
	 }
	 
	}