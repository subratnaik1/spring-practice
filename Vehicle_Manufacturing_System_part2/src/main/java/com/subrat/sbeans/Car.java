package com.subrat.sbeans;

import lombok.Setter;

public class Car implements Vehicle {
	
	 private Engine engine_type;
	private String number_of_doors;
	
	public Car(Engine engine_type, String number_of_doors) {
		super();
		this.engine_type = engine_type;
		this.number_of_doors = number_of_doors;
	}
	
	@Override
	public String getDescription() {
		return "engine type-"+this.engine_type+" and number of doors "+this.number_of_doors;
	}
}
