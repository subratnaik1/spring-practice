package com.subrat.sbeans;

import org.springframework.stereotype.Component;

@Component("googlePayService")
public class GooglePayService implements PaymentService {
	public void play(double amount) {
		System.out.println("paid "+amount+"using GooglePay");
	}
}
