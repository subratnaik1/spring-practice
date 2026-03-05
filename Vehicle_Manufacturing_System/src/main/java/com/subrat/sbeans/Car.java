package com.subrat.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
public class Car implements Vehicle{

	@Override
	public void assemble() {
		System.out.println("Assembling a Car with automatic transmission.");
	}
	
	public Car() {
	System.out.println("Car.Car()");
	}
}
