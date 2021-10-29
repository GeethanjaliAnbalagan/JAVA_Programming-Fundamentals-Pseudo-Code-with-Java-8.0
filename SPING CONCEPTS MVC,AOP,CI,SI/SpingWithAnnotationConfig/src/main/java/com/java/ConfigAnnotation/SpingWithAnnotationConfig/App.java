package com.java.ConfigAnnotation.SpingWithAnnotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		ApplicationContext factory = new AnnotationConfigApplicationContext(Appconfig.class);
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
