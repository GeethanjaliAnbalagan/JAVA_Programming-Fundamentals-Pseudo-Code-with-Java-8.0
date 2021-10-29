package com.java.configAnnotation.SpringconfigAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public car getcar()
	{
		return new car();
	
	}

}
