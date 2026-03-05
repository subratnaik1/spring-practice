package com.subrat.sbeans;

import org.springframework.stereotype.Component;

@Component("b")
public class Bike implements Vehicle {

	@Override
	public void assemble() {
		System.out.println("Assembling a Bike with lightweight alloy frame.");
	}

}
