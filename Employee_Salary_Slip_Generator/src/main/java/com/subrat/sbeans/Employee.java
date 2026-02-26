package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String name;
	private double basicSalary;
	private double hra;
	private double da;
	private double taxPercentage;

	public Employee(@Value("1") int id,@Value("subrat") String name,@Value("40000") double basicSalary, @Value("8000")double hra, @Value("2000")double da, @Value("10")double taxPercentage) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
		this.taxPercentage = taxPercentage;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public double getHra() {
		return hra;
	}

	public double getDa() {
		return da;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

}
