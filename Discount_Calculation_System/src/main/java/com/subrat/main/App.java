package com.subrat.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.config.AppConfig;
import com.subrat.sbeans.BillingService;
import com.subrat.sbeans.DiscountStrategy;
import com.subrat.sbeans.EliteCustomerDiscount;
import com.subrat.sbeans.PremiumCustomerDiscount;
import com.subrat.sbeans.RegularCustomerDiscount;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter purchase amount");
		int p = Integer.parseInt(sc.nextLine());
		System.out.println("enter customer type : (regular/premium/elite)");
		String type = sc.nextLine();

		switch (type) {
		case "regular" -> {
			DiscountStrategy bean = ctx.getBean("regularCustomerDiscount", RegularCustomerDiscount.class);
			BillingService bean2 = ctx.getBean(BillingService.class);
			bean2.setDiscountStrategy(bean);
			bean2.generateBill(p);
		}
		case "premium" -> {
			DiscountStrategy bean = ctx.getBean("premiumCustomerDiscount", PremiumCustomerDiscount.class);
			BillingService bean2 = ctx.getBean(BillingService.class);
			bean2.setDiscountStrategy(bean);
			bean2.generateBill(p);
		}
		case "elite" -> {
			DiscountStrategy bean = ctx.getBean("eliteCustomerDiscount", EliteCustomerDiscount.class);
			BillingService bean2 = ctx.getBean(BillingService.class);
			bean2.setDiscountStrategy(bean);
			bean2.generateBill(p);
		}

		}
	}
}
