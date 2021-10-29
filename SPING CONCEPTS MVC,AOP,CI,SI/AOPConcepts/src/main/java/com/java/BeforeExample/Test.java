package com.java.BeforeExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class Test{  
    public static void main(String[] args){  
    	System.out.println("this is working");
        ApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);  
        Operation e = (Operation) context.getBean(Operation.class);  
        System.out.println("calling msg...");  
        e.msg();  
        System.out.println("calling m...");  
        e.m();  
        System.out.println("calling k...");  
        e.k();  
        System.out.println("this is working");
    }  
}  