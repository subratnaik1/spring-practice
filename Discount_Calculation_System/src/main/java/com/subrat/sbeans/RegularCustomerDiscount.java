package com.subrat.sbeans;

public class RegularCustomerDiscount implements DiscountStrategy  {

	@Override
	public double calculateDiscount(double amount) {
		return amount-amount*0.05;

	}

}
