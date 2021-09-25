
package javaf;

import java.util.*;
public class Main
{
public static void main(String[] args){
        double a,b,c,fuels,gallons,miles,result;
        Scanner scan= new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank");
		a=scan.nextDouble();
		if(a<=0){
	       System.out.print((int)a+" is an Invalid Input");
	  }
      else{
		    System.out.println("Enter the distance covered");
		    b =scan.nextDouble();
		
	  if(b<=0){
		     System.out.print((int)b+" is an Invalid Input");
		}
	  
	      
	    else{
		    
		fuels=(a/b)*100;
		miles=b*0.6214;
		gallons=a*0.2642;
		result=miles/gallons;
		System.out.println("Liters/100KM");
		System.out.format("%.2f", fuels);
		System.out.println();
		System.out.println("Miles/gallons");
		System.out.format("%.2f", result);
		
        }
		
		
}
}
}
