package com.subrat.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.config.AppConfig;
import com.subrat.sbeans.PaymentProcessor;

public class MainFile {
public static void main(String[]args) {
	
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
	PaymentProcessor pp=ctx.getBean(PaymentProcessor.class);
	pp.processPayment(2500);
}
	
}
