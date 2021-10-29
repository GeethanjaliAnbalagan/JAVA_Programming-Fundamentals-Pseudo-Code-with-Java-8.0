package com.java.NotBeanConfig.SpringNotBeanConfig;

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
       @SuppressWarnings("resource")
	ApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
        car obj = con.getBean(car.class);
        obj.carConfig();
    }
}
