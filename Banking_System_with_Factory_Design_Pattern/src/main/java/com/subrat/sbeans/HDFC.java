package com.subrat.sbeans;

import org.springframework.stereotype.Component;

@Component("hdfc")
public class HDFC implements Bank {
	private double amount;

	@Override
	public double getAmount() {
		return this.amount;
	}

	@Override
	public void setAmount(double amount) {
     this.amount=amount;
	}

	@Override
	public String deposit(double amount) {
		this.amount+=amount;
		return "amount deposited ";
	}

	@Override
	public String withdraw(double amount) {
		if(amount>this.amount) {
			System.err.println("Insufficient Balance");
		}
		this.amount-=amount;
		return "amount : "+amount;
	}
     public String toString() {
    	 return "current balance in HDFC account is"+amount;
     }
}
