package com.subrat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	@Bean("messageSource")
	public ResourceBundleMessageSource create() {
    ResourceBundleMessageSource rs= new ResourceBundleMessageSource();
    rs.setBasename("com/subrat/commons/messages");
	return rs;     
	}
}
