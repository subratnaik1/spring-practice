package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceCenter {
	private Vehicle vehicle;
	private String serviceType;

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	@Autowired
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String performService(String serviceType) {
		this.serviceType = serviceType;
		return "Service type: " + this.serviceType + ", vehicle: " + vehicle.displayVehicleInfo();
	}
}
