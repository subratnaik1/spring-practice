package com.subrat.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.config.AppConfig;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter language");
		String lang=sc.nextLine();
		Locale locale = new Locale(lang);
		System.out.println("enter name");
		String name=sc.nextLine();
		String message = ctx.getMessage("date.message", new Object[] {name},locale);
		System.out.println(message);
	}
}
