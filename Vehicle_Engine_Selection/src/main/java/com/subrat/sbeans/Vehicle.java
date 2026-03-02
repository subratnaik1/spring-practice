package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Vehicle {
@Autowired
@Qualifier("electricEngine")
private Engine engine;
public void statrVehicle() {
	engine.start();
}
}
