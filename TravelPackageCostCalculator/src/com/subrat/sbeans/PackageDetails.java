package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PackageDetails {
	@Value("500")
	private double packageCostPerPerson;
	@Value("4")
	private int numberOfTravelers;
	@Value("10")
	private double discountPercentage;
	
	public double getPackageCostPerPerson() {
		return packageCostPerPerson;
	}
	public void setPackageCostPerPerson(double packageCostPerPerson) {
		this.packageCostPerPerson = packageCostPerPerson;
	}
	public int getNumberOfTravelers() {
		return numberOfTravelers;
	}
	public void setNumberOfTravelers(int numberOfTravelers) {
		this.numberOfTravelers = numberOfTravelers;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	
}
