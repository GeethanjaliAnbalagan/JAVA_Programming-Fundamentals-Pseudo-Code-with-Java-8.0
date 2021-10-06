package Multithreading;

//Priority of a Thread (Thread Priority)

class Multi7 extends Thread {
	public void run() {
		System.out.println("running thread name is:" + Thread.currentThread().getName());
		System.out.println("running thread priority is:" + Thread.currentThread().getPriority());

	}

	public static void main(String args[]) {
		Multi7 m1 = new Multi7();
		Multi7 m2 = new Multi7();
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();

	}
}
/*
 * 3 constants defined in Thread class: public static int MIN_PRIORITY public
 * static int NORM_PRIORITY public static int MAX_PRIORITY Default priority of a
 * thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of
 * MAX_PRIORITY is 10.
 */