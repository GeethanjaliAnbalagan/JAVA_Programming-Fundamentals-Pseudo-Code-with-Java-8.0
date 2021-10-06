package com.java.syncronous;



/*synchronized (object) {
			//code of the block.
			}
			Program to understand the Synchronized Block:*/
			class Power{  
			void printPower(int n){ 
			synchronized(this){ //synchronized block
			   int temp = 1;
			   for(int i=1;i<=5;i++){ 
			        System.out.println(Thread.currentThread().getName() + ":- " +n + "^"+ i + " value: " + n*temp);
			     temp = n*temp;
			     try{  
			      Thread.sleep(500);  
			     }catch(Exception e){System.out.println(e);}  
			   }  
			 }  
			}  
			}
			  
			class Thread1 extends Thread{  
			Power p;  
			Thread1(Power p){  
			this.p=p;  
			}  
			public void run(){  
			p.printPower(5);  
			}  
			  
			}  
			class Thread2 extends Thread{  
			Power p;  
			Thread2(Power p){  
			this.p=p;  
			}  
			public void run(){  
			p.printPower(8);  
			}  
			}  
			  
			public class WithBlockSyncronization {  
			public static void main(String args[]){  
			Power obj = new Power();//only one object  
			Thread1 p1=new Thread1(obj);  
			Thread2 p2=new Thread2(obj);  
			p1.start();  
			p2.start();

			}  
			}
