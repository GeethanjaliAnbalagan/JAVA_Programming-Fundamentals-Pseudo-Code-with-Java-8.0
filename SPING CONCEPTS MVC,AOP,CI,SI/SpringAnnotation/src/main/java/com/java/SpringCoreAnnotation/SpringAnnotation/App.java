package com.java.SpringCoreAnnotation.SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
        vechile obj = (vechile)context.getBean("vechile");
        obj.rider();
        
    }
}


