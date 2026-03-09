package com.subrat.sbeans;

import org.springframework.stereotype.Component;

@Component("sbi")
public class SBI implements Bank {
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
			System.exit(0);
		}
		this.amount-=amount;
		return "amount : "+amount;
	}
     public String toString() {
    	 return "current balance in SBI account is"+amount;
     }
}
