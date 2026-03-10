package com.subrat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan("com.subrat")
public class AppConfig {
	
	@Bean(name = "messageSource")
	public ResourceBundleMessageSource createRBMS() {
		ResourceBundleMessageSource rource = new ResourceBundleMessageSource();
		rource.setBasename("com.subrat.resources/messages");
		return rource;
	}
	
}
