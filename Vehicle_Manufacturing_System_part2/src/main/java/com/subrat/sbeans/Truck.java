package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

public class Truck implements Vehicle {
	
	private Engine engine_type;
	private String payload_capacity;

	public Truck(Engine engine_type, String payload_capacity) {
		super();
		this.engine_type = engine_type;
		this.payload_capacity = payload_capacity;
	}

	@Override
	public String getDescription() {
		return "Engine type-"+engine_type+" and payload capacity"+payload_capacity;
	}

}
