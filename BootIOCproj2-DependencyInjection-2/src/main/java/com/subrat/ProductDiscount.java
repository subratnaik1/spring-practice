package com.subrat;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.subrat.service.DiscountService;

@SpringBootApplication
public class ProductDiscount {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ProductDiscount.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter original price:");
		int price = Integer.parseInt(sc.nextLine());
		System.out.println("Enter discount percentage:");
		double discount = Double.parseDouble(sc.nextLine());
		DiscountService ds = ctx.getBean("ds", DiscountService.class);
		System.out.println(	ds.applyDiscount(price, discount));
	}

}
