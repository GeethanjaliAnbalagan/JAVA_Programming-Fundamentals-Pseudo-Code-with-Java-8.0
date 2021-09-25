package javaf;
import java.util.Scanner; // import the Scanner class 

public class PackageEg {

	  public static void main(String[] args) {
		  
	   
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner myObj1 = new Scanner(System.in);
	    Scanner myobj2 = new Scanner(System.in);
	    String userName;
	    String adress;
	    for(int i=1;i<=5;i++)
	    {
	    // Enter username and press Enter
	    System.out.println("Enter username"); 
	    userName = myObj.nextLine();
	    System.out.println("Username is: " + userName);  
	    }
	    /*
	    System.out.println("Username is: " + userName);   
	   
	    System.out.println("Enter department"); 
	    userName = myObj1.nextLine();      
	    System.out.println("depatment is: " + userName);   
	    
	    System.out.println("Enter the adress");
	    adress = myobj2.nextLine();
	    System.out.println("Address of the user" + adress );
	  }*/
	  }
	}

