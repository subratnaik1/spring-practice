package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.subrat.factory.BankFactory;
@Component
public class Customer {
	private int customerId;
	private String customerName;
	private Bank bank;
	@Autowired
	private BankFactory bankFactory;

	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public void setBank(String bankType) {
		this.bank=bankFactory.createBank(bankType);
	}
	public void deposit(double amount) {
		bank.deposit(amount);
	}
	public void withdraw(double amount) {
		bank.withdraw(amount);
	}
	public void displayDetails() {
		System.out.println("Customer [customerId=" + customerId + ", customerName=" + customerName + ", bank=" + bank+ "+account balance"+bank.getAmount()+"]");
	}
	@Override
	public String toString() {
	    return bank.toString();
	}
}
