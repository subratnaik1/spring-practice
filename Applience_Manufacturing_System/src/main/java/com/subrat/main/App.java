package com.subrat.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.ApplianceFactory.ApplianceFactory;
import com.subrat.config.AppConfig;
import com.subrat.sbeans.Appliance;

public class App {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
    	Scanner sc=new Scanner(System.in);
    	System.out.println("appliance name washingMachine or refrigerator)");
    	String appliance=sc.nextLine();    	
    	ApplianceFactory af=ctx.getBean(ApplianceFactory.class);
    	Appliance a=af.getAppliance(appliance);
    	a.manufacture();
    	
    }
}
