package com.java.anonymous;
// method local inner class in java

class OuterClass{
	void outerMethod(){
		final String str = "This is outer method";
		System.out.println("This is outer class method");
		
		class InnerClass{
			
			 public  void display() {
				
				System.out.println("This is the inner class");
				
			}
		}
		
		InnerClass obj = new InnerClass();
		obj.display();
	}
}	
	

class Nested{
	public static void main(String[] args) {
		
		
		OuterClass obj1 = new OuterClass();
		obj1.outerMethod();
		
	}
	
	
}
 
				
						
					
	
	
	
