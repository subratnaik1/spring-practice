package com.subrat.service;

import org.springframework.stereotype.Component;

@Component("ds")
public class DiscountService {
	public double applyDiscount(double price, double discountPercentage) {
		return price-(price*discountPercentage/100);
	}
}
