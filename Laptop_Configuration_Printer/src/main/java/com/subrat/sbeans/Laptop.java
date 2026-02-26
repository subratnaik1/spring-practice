package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private String brand;
	private String processor;
	private String ram;
    
	public Laptop(@Value("Dell") String brand, @Value("Intel i7") String processor, @Value("16GB") String ram) {
		super();
		this.brand = brand;
		this.processor = processor;
		this.ram = ram;
	}

	public String getBrand() {
		return brand;
	}

	public String getProcessor() {
		return processor;
	}

	public String getRam() {
		return ram;
	}

}
