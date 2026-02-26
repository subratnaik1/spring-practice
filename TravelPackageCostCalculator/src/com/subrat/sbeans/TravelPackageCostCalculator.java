package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TravelPackageCostCalculator {
	@Autowired
	private PackageDetails packagedetails;
	
	public double calculateFinalPackageCost() {
		double total=packagedetails.getPackageCostPerPerson()*packagedetails.getNumberOfTravelers();
		double discount=total*packagedetails.getDiscountPercentage()/100;
		double finalCost=total-discount;
		
		return finalCost;
	
	}

}
