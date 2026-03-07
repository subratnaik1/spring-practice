package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
public class Motorcycle implements Vehicle {
	private Engine engine_type;
	private boolean hasSideCar;
	
	public Motorcycle(Engine engine_type, boolean hasSideCar) {
		super();
		this.engine_type = engine_type;
		this.hasSideCar = hasSideCar;
	}


	@Override
	public String getDescription() {
		return "Engine_type-"+engine_type+"has Side Car-"+hasSideCar;
	}

}
