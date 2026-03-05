package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class ShoppingContext {
	
	private ShoppingService shoppingService;

	public ShoppingContext(ShoppingService shoppingService) {
		super();
		this.shoppingService = shoppingService;
	}	
}
