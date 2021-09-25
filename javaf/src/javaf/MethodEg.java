package javaf;

public class MethodEg
{
	

	 void name(String a) 
	 {
	    System.out.println(a + " Refsnes");
	  }
	 void sam(String a) 
	 {
	    System.out.println(a + " Refsnes");
	  }
	 
	 void num(int b) 
	 {
	    System.out.println(b + " Refsnes");
	  }

	  public static void main(String[] args)
	  {
		   MethodEg methodeg = new MethodEg();
		
		  methodeg.name("Liam");
		  methodeg.name("Jenny");
		  methodeg.name("Anja");
		  methodeg.sam("geetha");
		  methodeg.num(5);
		  
		  
		  //myMethod("Liam");
	 
}
}


