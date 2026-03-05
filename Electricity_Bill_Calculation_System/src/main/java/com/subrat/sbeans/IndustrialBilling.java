package com.subrat.sbeans;

public class IndustrialBilling implements BillingStrategy {

	@Override
	public double calculateBill(double units) {
		return units*10;
	}

}
