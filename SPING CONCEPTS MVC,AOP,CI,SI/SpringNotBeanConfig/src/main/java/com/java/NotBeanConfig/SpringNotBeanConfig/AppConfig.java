package com.java.NotBeanConfig.SpringNotBeanConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.java.NotBeanConfig.SpringNotBeanConfig")// it search by object type
public class AppConfig {

	/* @Bean
	 public car getCarshow()
	 {
		return new car();
	 }
	 @Bean
	 public RoyalShowRoom getModel()
	 {
		 return new CarModels();
		 
	 }*/
}
