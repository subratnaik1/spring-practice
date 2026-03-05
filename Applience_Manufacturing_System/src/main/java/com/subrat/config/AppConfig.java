package com.subrat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.subrat.sbeans.Refrigerator;
import com.subrat.sbeans.WashingMachine;
@Configuration
@ComponentScan({"com.subrat.sbeans","com.subrat.ApplianceFactory"})
public class AppConfig {
	@Bean("refrigerator")
	public Refrigerator refrigerator() {
		return new Refrigerator();
	}
	@Bean("washingMachine")
	public WashingMachine rashingMachine() {
		return new WashingMachine();
	}	
}
