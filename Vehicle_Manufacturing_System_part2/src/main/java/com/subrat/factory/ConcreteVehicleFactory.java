package com.subrat.factory;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.subrat.sbeans.Engine;
import com.subrat.sbeans.Vehicle;

@Component
public class ConcreteVehicleFactory implements VehicleFactory {
	@Autowired
	private Map<String, Vehicle> vehicle;
	@Autowired
	private Map<String, Engine> engine;

	@Override
	public Vehicle createVehicle(String type, String engineType) {
		return vehicle.get(type);
	}

}
