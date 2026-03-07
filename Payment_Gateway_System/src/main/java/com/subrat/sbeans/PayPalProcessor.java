package com.subrat.sbeans;

import org.springframework.stereotype.Component;

@Component
public class PayPalProcessor implements PaymentProcessor{

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing payment via PayPal. Amount: "+amount);
	}

}
