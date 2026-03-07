package com.subrat.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.subrat.sbeans.Vehicle;
@Component 
public class VehicleService {
	
	@Autowired
	private VehicleFactory vehicleFactory;
	
	public String createVehicle(String type, String engineType) {
		Vehicle v=	vehicleFactory.createVehicle(type, engineType);
		return v.getDescription();	
		
	}
}
