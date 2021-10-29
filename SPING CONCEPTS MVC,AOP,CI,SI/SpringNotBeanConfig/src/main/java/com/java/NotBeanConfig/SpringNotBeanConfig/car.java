package com.java.NotBeanConfig.SpringNotBeanConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class car {
     @Autowired
     @Qualifier("carModel2") //u can specify which interface you want
	RoyalShowRoom model;
	
	public RoyalShowRoom getModel() {
		return model;
	}

	public void setModel(RoyalShowRoom model) {
		this.model = model;
	}

	public void carConfig()
	{
		System.out.println("different types of cars in our show room");
		model.bmw();
		model.EcoSports();
		model.swift();
		
	}
	
	
}
