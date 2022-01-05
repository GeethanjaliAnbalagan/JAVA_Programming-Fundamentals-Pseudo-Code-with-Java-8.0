package Exceptionhandling;

//to handle another unchecked exception.

public class TryCatchExample9 {  
	  
    public static void main(String[] args)
    {  
    	try {
			String input = "123";
			System.out.println("Input is:" + input);
			int output = Integer.parseInt(input);
			System.out.println("Output is:" + output);
			System.out.println("remaining part of code");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Input is required");
		}catch(NumberFormatException e){
			System.out.println(e);
			System.out.println("Invalid input provided");
		}finally{
			System.out.println("Finally try block executed");
		}
		System.out.println("More code can go here");

	}

}

