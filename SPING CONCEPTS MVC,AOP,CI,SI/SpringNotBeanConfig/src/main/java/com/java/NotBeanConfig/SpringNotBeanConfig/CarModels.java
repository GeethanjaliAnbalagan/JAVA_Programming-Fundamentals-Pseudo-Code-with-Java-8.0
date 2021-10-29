package com.java.NotBeanConfig.SpringNotBeanConfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component  //non Qualified and de capitalized by default
//@Primary
public class CarModels implements RoyalShowRoom  {

	@Override
	public void bmw() {

			System.out.println("BMW Model-1008 BLACK 1C");

	}

	@Override
	public void swift() {
		System.out.println("SWIFT DESIRE Model-FZ WHITE 10L");

	}

	@Override
	public void EcoSports() {
		System.out.println("ECO SPORTS Model-DDD BROWN 15L");


	}

}
