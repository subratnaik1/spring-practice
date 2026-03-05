package com.subrat.factory;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.subrat.sbeans.Vehicle;
@Component
public class VehicleFactory {
	@Autowired
	private Map<String, Vehicle> vehicles;

	public Vehicle getVehicle(String type) {
		return vehicles.get(type);
	}
}
