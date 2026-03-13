package com.subrat.main;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.config.AppConfig;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter languaeg");
		String lang=sc.nextLine();
		System.out.println("enter date");
		String date=sc.nextLine();
		Locale locale = new Locale(lang);
		LocalDate date2=LocalDate.parse(date);
		String message = ctx.getMessage("date.message", new Object[] {date2},locale);
		System.out.println(message);
			}
}
