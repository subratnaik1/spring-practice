package com.subrat.factory;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.subrat.sbeans.PaymentProcessor;
@Component
public class PaymentFactory {
	@Autowired
	private Map<String, PaymentProcessor> paymentprocess;

	public PaymentProcessor getPaymentProcessor(String method) {
		return paymentprocess.get(method);
	}
}
