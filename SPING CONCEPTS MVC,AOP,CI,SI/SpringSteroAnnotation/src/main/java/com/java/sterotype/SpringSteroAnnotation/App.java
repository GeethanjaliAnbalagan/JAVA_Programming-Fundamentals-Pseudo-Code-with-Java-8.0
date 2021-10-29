package com.java.sterotype.SpringSteroAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext con = new ClassPathXmlApplicationContext("spring1.xml");
        vechile obj = (vechile)con.getBean("car");
        obj.rider();
    }
}
