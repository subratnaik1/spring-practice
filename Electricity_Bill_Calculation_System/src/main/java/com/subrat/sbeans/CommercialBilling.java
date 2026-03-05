package com.subrat.sbeans;

public class CommercialBilling implements BillingStrategy {

	@Override
	public double calculateBill(double units) {
		return units*8;
	}

}
