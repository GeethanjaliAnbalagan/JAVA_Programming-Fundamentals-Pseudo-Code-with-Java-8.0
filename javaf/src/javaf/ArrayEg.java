package javaf;

public class ArrayEg {
	 public static void main(String[] args) {
		    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	 
		    
		    for (int i = 0; i < cars.length; i++) { //i=0 i<4  i=1 1<4
		       System.out.println(cars[i]);//car[0] car[1] 
		    }
		        
		        
		    cars[0] = "Opel";
		    System.out.println(cars[0]);
		    
		    System.out.println(cars.length);
		    
		    for (int j = 0; j < cars.length; j++) {
		        System.out.println(cars[j]);
		      }
		  }

}
