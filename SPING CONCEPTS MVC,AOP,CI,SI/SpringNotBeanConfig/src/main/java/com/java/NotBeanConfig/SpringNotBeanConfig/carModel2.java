package com.java.NotBeanConfig.SpringNotBeanConfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class carModel2 implements RoyalShowRoom {

	@Override
	public void bmw() {
		System.out.println("2nd hand BMW  50L");
	}

	@Override
	public void swift() {
		System.out.println("2nd hand Swift  4L");

	}

	@Override
	public void EcoSports() {
		System.out.println("2nd hand EcoSports  7L");
	}

}
