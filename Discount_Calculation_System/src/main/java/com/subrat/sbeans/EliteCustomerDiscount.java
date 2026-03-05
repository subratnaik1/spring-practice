package com.subrat.sbeans;

public class EliteCustomerDiscount implements DiscountStrategy{

	@Override
	public double calculateDiscount(double amount) {
		return amount-amount*0.15;
	}
	
	public EliteCustomerDiscount() {
	System.out.println("EliteCustomerDiscount.EliteCustomerDiscount()");
	}

}
