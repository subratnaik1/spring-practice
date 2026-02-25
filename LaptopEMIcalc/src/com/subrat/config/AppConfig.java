package com.subrat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.subrat.sbeans.LaptopEMICalculator;

@Configuration
public class AppConfig {
    @Bean
	public LaptopEMICalculator laptopEMICalculator() {
		return new LaptopEMICalculator(60000,10000,10);
	}
}
