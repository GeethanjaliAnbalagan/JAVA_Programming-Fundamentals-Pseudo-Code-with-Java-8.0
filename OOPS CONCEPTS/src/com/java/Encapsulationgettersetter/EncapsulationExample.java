package com.java.Encapsulationgettersetter;
import java.util.*;

public class EncapsulationExample {
	
    public static void main(String[] args) {
    	
        Human h1 = new Human();
       
        // using setters of Human
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Details:");
        System.out.println("Weight");
        float a1=sc.nextFloat();
        System.out.println("Height");
        sc.nextLine();
        float b1=sc.nextFloat();
        h1.setHeight(b1);
        h1.setWeight(a1);
        h1.setBmi(calculateBmi(h1));
         
        // using getters of Human
        System.out.println("Person has "+h1.getWeight()+" kgs and is "+h1.getHeight()+" meters in height, which results in BMI of "+h1.getBmi());
        sc.close();
    }
     
    public static float calculateBmi(Human h1){
        return h1.getWeight()/(h1.getHeight()*h1.getHeight()); 
    }
    
}
