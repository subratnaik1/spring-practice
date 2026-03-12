package com.subrat.sbeans;

import java.io.Serializable;


import lombok.Data;
@Data
public class Product implements Serializable{

	private int productID;
	private String productName;
	private String description;
	private double price;
		
}
