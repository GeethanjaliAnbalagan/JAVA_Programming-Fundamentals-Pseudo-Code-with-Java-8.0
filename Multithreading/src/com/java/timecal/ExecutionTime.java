package com.java.timecal;

public class ExecutionTime extends Thread {

	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				//long start = System.nanoTime();
				long start = System.currentTimeMillis();
				Thread.sleep(5000);
				System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
				/*long end = System.nanoTime();
				long execution = end - start;
				System.out.println("Execution time : " + execution + " nanoseconds");
				*/
				
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	// main method
	public static void main(String[] args) {
		ExecutionTime t1 = new ExecutionTime();
		ExecutionTime t2 = new ExecutionTime();
		long start = System.nanoTime();
		t1.start();
		long end = System.nanoTime();
		long execution = end - start;
		System.out.println("Execution time thread-1: " + execution + " nanoseconds");
		long start1 = System.nanoTime();
		t2.start();
		long end1 = System.nanoTime();
		long execution1 = end1 - start1;
		System.out.println("Execution time thread-2: " + execution1 + " nanoseconds");
	

	}
}
