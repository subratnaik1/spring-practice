package com.subrat.sbeans;

import org.springframework.stereotype.Component;

@Component
public class ElectricityBillingSystem {
	private BillingStrategy billingStrategy;
	
	
	public void setBillingStrategy(BillingStrategy billingStrategy) {
		this.billingStrategy = billingStrategy;
	}

	public void showBill(double units) {
		System.out.println("Units Consumed:"+units);
		System.out.println("Rate per Unit:"+billingStrategy.calculateBill(1));
		System.out.println("Total Bill Amount:"+units*billingStrategy.calculateBill(1));
	}

}
