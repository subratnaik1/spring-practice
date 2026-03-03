package com.subrat.sbeans;

public interface ShoppingService {
	
	void addItem(String item, double price);
	void checkout();
	void viewCart();
}
