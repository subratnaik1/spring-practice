package com.subrat.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.config.AppConfig;
import com.subrat.factory.VehicleFactory;
import com.subrat.sbeans.Vehicle;

public class App {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter ->car, truck, bike");
    	String vcl=sc.nextLine();
    	
    	VehicleFactory v=ctx.getBean(VehicleFactory.class);
    	Vehicle bean=v.getVehicle(vcl);
    	bean.assemble();
    	
    }
}
