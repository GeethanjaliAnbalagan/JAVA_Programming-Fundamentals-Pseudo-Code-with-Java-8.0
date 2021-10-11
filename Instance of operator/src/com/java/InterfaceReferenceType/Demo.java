package com.java.InterfaceReferenceType;

class Demo implements Callable {
	  public void call() {
	    System.out.println("Calling...");
	  }
	  public static void main(String[] args) {
	    
	    Callable d = new Demo();
	    // Refer to a class
	    System.out.println((d instanceof Demo));
	    // Refer to an interface
	    System.out.println((d instanceof Callable));
	    
	  }
	}
	  