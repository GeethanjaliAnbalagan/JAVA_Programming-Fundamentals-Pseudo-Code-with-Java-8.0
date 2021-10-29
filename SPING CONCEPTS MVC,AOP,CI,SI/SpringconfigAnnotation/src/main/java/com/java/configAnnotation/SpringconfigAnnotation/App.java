package com.java.configAnnotation.SpringconfigAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);
        car obj = factory.getBean(car.class);
        obj.rider();
    }
}
