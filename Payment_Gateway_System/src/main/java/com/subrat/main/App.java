package com.subrat.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.config.AppConfig;
import com.subrat.factory.PaymentFactory;
import com.subrat.sbeans.PaymentProcessor;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter (Credit Card, PayPal, or UPI)");
		String type = sc.nextLine();

		PaymentFactory pf = ctx.getBean(PaymentFactory.class);
		PaymentProcessor p = pf.getPaymentProcessor(type);
		p.processPayment(500);

	}
}
