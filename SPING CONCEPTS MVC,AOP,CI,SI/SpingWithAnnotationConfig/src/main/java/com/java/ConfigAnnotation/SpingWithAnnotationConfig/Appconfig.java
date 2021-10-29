package com.java.ConfigAnnotation.SpingWithAnnotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

	@Bean
	public Samsung getPhone() {
		return new Samsung();

	}
    @Bean
    public  MobileProcessor getPro()
    {
    	return new Snapdragon();
    }
}
