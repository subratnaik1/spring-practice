package com.subrat.sbeans;

public class ResidentialBilling implements BillingStrategy{

	@Override
	public double calculateBill(double units) {
		return units*5;
	}

}
