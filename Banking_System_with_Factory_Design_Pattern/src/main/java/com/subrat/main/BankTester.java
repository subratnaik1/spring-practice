package com.subrat.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.config.AppConfig;
import com.subrat.factory.BankFactory;
import com.subrat.factory.ConcreteBankFactory;
import com.subrat.sbeans.Bank;
import com.subrat.sbeans.Customer;

public class BankTester {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter bank name");
    	String banktype=sc.nextLine();
    	Customer customer=ctx.getBean(Customer.class);
    	customer.setBank(banktype);
    	System.out.println("enter amount to deposit");
    	double amount=Double.parseDouble(sc.nextLine());
    	customer.deposit(amount);
    	System.out.println("enter amount to withdraw");
    	double amountw=Double.parseDouble(sc.nextLine());
    	customer.withdraw(amountw);
    	System.out.println(customer);
    	customer.displayDetails();
    }
}
