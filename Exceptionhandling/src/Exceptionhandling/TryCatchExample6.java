package Exceptionhandling;

public class TryCatchExample6 {  
	  
    public static void main(String[] args) {  
        int i=50;  
        int j=0;  
        int data;  
        try  
        {  
        data=i/j; //may throw exception   50/0
        System.out.println(data);
        }  
            // handling the exception  
        catch(Exception e)  
        {  
             // resolving the exception in catch block  
            System.out.println(i/(j+2));//50/2  
        	//System.out.println(e);
        }  
    }  
}  