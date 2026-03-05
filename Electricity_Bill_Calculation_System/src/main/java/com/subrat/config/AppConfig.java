package com.subrat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.subrat.sbeans.CommercialBilling;
import com.subrat.sbeans.IndustrialBilling;
import com.subrat.sbeans.ResidentialBilling;
@Configuration
@ComponentScan("com.subrat.sbeans")
public class AppConfig {
	@Bean("residential")
	public ResidentialBilling residentialBilling() {
		return new ResidentialBilling();
	}
	@Bean("commercial")
	public CommercialBilling commercialBilling() {
		return new CommercialBilling();
	}
	@Bean("industrial")
	public IndustrialBilling industrialBilling() {
		return new IndustrialBilling();
	}
}
