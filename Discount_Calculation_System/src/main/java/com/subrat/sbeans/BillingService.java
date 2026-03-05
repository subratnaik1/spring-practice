package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BillingService {

	protected DiscountStrategy discountStrategy;

	public void setDiscountStrategy(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}

	public void generateBill(double amount) {
		System.out.println("Original Amount: ₹" + amount);
		System.out.println("Discount Applied: " + discountStrategy.calculateDiscount(amount));
		System.out.println("Final Payable Amount: " + (amount - discountStrategy.calculateDiscount(amount)));
	}

}
