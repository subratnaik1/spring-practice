package com.subrat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.subrat.sbeans.EmailNotification;
import com.subrat.sbeans.SMSNotification;
import com.subrat.sbeans.WhatsAppNotification;

@Configuration
@ComponentScan("com.subrat.sbeans")
public class AppConfig {
     @Bean("email")
	public EmailNotification emailNotification() {
		return new EmailNotification();
	}
     @Bean("sms")
	public SMSNotification smsNotification() {
		return new SMSNotification();
	}
     @Bean("whatsapp")
	public WhatsAppNotification whatsAppNotification() {
		return new WhatsAppNotification();
	}
}
