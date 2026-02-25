package com.subrat.sbeans;

public class LaptopEMICalculator {
 private double laptopPrice;
 private double downPayment;
 private int emiMonths;
 
 public LaptopEMICalculator(double laptopPrice, double downPayment, int emiMonths) {
	super();
	this.laptopPrice = laptopPrice;
	this.downPayment = downPayment;
	this.emiMonths = emiMonths;
 }
 
 public double  calculateMonthlyEMI() {
	 double remainingAmount=laptopPrice-downPayment;
	 double monthlyEMI=remainingAmount/emiMonths;
	 return monthlyEMI;
 }
 
}
