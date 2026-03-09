package com.subrat.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.config.AppConfig;
import com.subrat.factory.ConcreteVehicleFactory;
import com.subrat.sbeans.Vehicle;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter vehicle type(car,truck,motorcycle)");
		String type = sc.nextLine();
		System.out.println("enter engine type (diesel,electric)");
		String engineType = sc.nextLine();

		ConcreteVehicleFactory cvf= ctx.getBean(ConcreteVehicleFactory.class);
		Vehicle v=cvf.createVehicle(type, engineType);
		System.out.println(v.getDescription());
	}
}
