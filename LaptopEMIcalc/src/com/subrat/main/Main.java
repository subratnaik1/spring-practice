package com.subrat.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.config.AppConfig;
import com.subrat.sbeans.LaptopEMICalculator;
public class Main
{
	void main() {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		LaptopEMICalculator calculator= ctx.getBean(LaptopEMICalculator.class);
		double emi=calculator.calculateMonthlyEMI();
		IO.print("Monthly EMI: "+emi);
	}
     
}
