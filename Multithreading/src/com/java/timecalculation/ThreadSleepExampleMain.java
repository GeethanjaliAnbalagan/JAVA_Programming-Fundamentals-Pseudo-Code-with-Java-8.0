package com.java.timecalculation;

public class ThreadSleepExampleMain {
	 
	 public static void main(String args[])
	 {
	  FirstThread ft= new FirstThread();
	 
	  Thread t1=new Thread(ft);
	  Thread t2=new Thread(ft);
	  t1.start();
	  
	  
	  for (int i = 1; i < 5; i++) {
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
	  t2.start();
	  for (int i = 1; i < 5; i++) {
	  long startTime1=System.currentTimeMillis();
	  try {
	                // putting thread on sleep
	   Thread.sleep(5000);
	  } catch (InterruptedException e) {
	   e.printStackTrace();
	  }
	  long endTime1=System.currentTimeMillis();
	  long timeDifference1=(endTime1-startTime1);
	  System.out.println("Time difference between before and after sleep call THREAD-2: "+timeDifference1);
	 
	  System.out.println(i);
	  }
	 
	 }
	 
	}
	 