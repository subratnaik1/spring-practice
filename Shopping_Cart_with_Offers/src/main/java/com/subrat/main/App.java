package com.subrat.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.config.AppConfig;
import com.subrat.sbeans.ShoppingContext;
import com.subrat.sbeans.ShoppingService;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter flipcart or amazon");
		String b = sc.nextLine();
		while (true) {			
			ShoppingService sct = ctx.getBean(b, ShoppingService.class);
			System.out.println("1=add item to cart");
			System.out.println("2=view cart");
			System.out.println("3=checkout");
			System.out.println("4=exit");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1 -> {
				System.out.println("enter product name");
				String product = sc.nextLine();
				System.out.println("enter product price");
				Double price = sc.nextDouble();
				sc.nextLine();
				sct.addItem(product, price);
			}
			case 2 -> sct.viewCart();
			case 3 -> {
				sct.checkout();
				System.exit(0);
			}
			case 4 -> System.exit(0);
			}
		}
	}
}
