package com.subrat.sbeans;

public class PaytmPaymentService implements PaymentService {

	public void play(double amount) {
		System.out.println("paid "+amount+"using paytm");
	}

}
