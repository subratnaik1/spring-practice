package com.subrat.ApplianceFactory;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.subrat.sbeans.Appliance;
@Component
public class ApplianceFactory {
     @Autowired
	private Map<String,Appliance> applience;
	
	public Appliance getAppliance(String type) {
		return applience.get(type);
	}

}
