package Multithreading;

/* The join() method waits for a thread to die. In other words, it causes the currently
 *  running threads to stop executing until the thread it joins with completes its task.
 */
class Multi5 extends Thread{  
	 public void run(){  
	  for(int i=1;i<=5;i++){  
	   try{  
	    Thread.sleep(500);  
	   }
	   catch(Exception e)
	   {System.out.println(e);
	   }  
	  System.out.println(i);  
	  }  
	 }  
	public static void main(String args[]){  
		Multi5 t1=new Multi5();  
		Multi5 t2=new Multi5();  
		Multi5 t3=new Multi5();  
	 t1.start();  
	 try{
		//In the above example,when t1 is completes its task for 1500 
		  //miliseconds(3 times) then t2 and t3 starts executing.
		
	  t1.join(1500);
	 }catch(Exception e)
	 {System.out.println(e);
	 }  
	  
	 t2.start();  
	 t3.start();  
	 }  
	}  