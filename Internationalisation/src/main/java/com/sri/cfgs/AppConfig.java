package com.sri.cfgs;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration

public class AppConfig {

	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource r = new ResourceBundleMessageSource();
		r.setBasename("com/sri/commons/App");
		r.setDefaultEncoding("UTF-8");
		return r;
	}
}
