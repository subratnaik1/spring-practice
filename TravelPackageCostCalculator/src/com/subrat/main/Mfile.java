package com.subrat.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.config.Appconfig;
import com.subrat.sbeans.TravelPackageCostCalculator;

public class Mfile {
 void main() {
	 AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
	 TravelPackageCostCalculator tpc=ctx.getBean(TravelPackageCostCalculator.class);
	double fprice= tpc.calculateFinalPackageCost();
	IO.println("Final package cost: "+fprice);
 }
}
