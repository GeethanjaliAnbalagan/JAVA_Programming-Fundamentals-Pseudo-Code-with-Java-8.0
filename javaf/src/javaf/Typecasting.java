package javaf;

public class Typecasting {

	static int a = 10;

	public static void main(String[] args) 
	{

		int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double

		System.out.println(myInt); // Outputs 9
		System.out.println(myDouble); // Outputs 9.0

		System.out.println(a);
	}

}
