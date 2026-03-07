package com.subrat.factory;

import org.springframework.stereotype.Component;

import com.subrat.sbeans.Vehicle;

public interface VehicleFactory {
	
	Vehicle createVehicle(String type, String engineType);
}
