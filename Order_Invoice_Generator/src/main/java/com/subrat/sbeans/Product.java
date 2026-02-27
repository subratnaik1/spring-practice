package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
	@Value("laptop")
	private String name;
	@Value("50000")
	private double price;
	@Value("2")
	private int quantity;
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	
}
