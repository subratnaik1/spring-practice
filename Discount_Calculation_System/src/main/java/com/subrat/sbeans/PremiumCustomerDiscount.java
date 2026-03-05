package com.subrat.sbeans;

import org.springframework.context.annotation.Lazy;

@Lazy(true)
public class PremiumCustomerDiscount implements DiscountStrategy{

	@Override
	public double calculateDiscount(double amount) {
		return amount-amount*0.10;
	}
	public PremiumCustomerDiscount() {
		System.out.println("PremiumCustomerDiscount.PremiumCustomerDiscount()");
	}

}
