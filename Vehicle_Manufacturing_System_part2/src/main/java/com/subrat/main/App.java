package com.subrat.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.config.AppConfig;
import com.subrat.factory.VehicleFactory;
import com.subrat.factory.VehicleService;
import com.subrat.sbeans.Vehicle;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter vehicle type");
		String type=sc.nextLine();
		System.out.println("enter engine type");
		String engineType=sc.nextLine();
		
		VehicleService vs=ctx.getBean(VehicleService.class);      
//		VehicleFactory vf=ctx.getBean(VehicleFactory.class);
//		Vehicle v=vf.createVehicle(type, engineType);
//		
		System.out.println(vs.createVehicle(type, engineType));
	}
}
