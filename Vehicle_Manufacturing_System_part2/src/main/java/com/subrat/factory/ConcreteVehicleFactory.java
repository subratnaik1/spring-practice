package com.subrat.factory;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.subrat.sbeans.Car;
import com.subrat.sbeans.Engine;
import com.subrat.sbeans.Motorcycle;
import com.subrat.sbeans.Truck;
import com.subrat.sbeans.Vehicle;

@Component
public class ConcreteVehicleFactory implements VehicleFactory {
	
	@Autowired
	private Map<String, Engine> engine;

	@Override
	public Vehicle createVehicle(String type, String engineType) {
		Engine engine = createEngine(engineType);
		
		return switch(type) {
		case "car" -> new Car(engine, "4");
		case "truck" -> new Truck(engine, "100 tone");
		case "motorcycle" ->new Motorcycle(engine,true);
		default -> null;
		};		
	}

	private Engine createEngine(String engineType) {
		return engine.get(engineType);
	}

}
