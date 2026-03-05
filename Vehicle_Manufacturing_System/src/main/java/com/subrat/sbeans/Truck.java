package com.subrat.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(true)
public class Truck implements Vehicle {

	@Override
	public void assemble() {
		System.out.println("Assembling a Truck with heavy-duty engine.");
	}
	
	public Truck() {
		System.out.println("Truck.Truck()");
	}

}
