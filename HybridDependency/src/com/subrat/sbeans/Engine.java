package com.subrat.sbeans;

import org.springframework.stereotype.Component;

public class Engine {

	private String engineType;
	private String horsePower;
	
	public Engine(String engineType, String horsePower) {
		super();
		this.engineType = engineType;
		this.horsePower = horsePower;
	}
	public String showEngineDetails() {
		return "engine type "+this.engineType+"horse power "+this.horsePower;
	}
	
	
}
