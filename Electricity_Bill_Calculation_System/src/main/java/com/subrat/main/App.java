package com.subrat.main;

import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.subrat.config.AppConfig;
import com.subrat.sbeans.BillingStrategy;
import com.subrat.sbeans.CommercialBilling;
import com.subrat.sbeans.ElectricityBillingSystem;
import com.subrat.sbeans.IndustrialBilling;
import com.subrat.sbeans.ResidentialBilling;

public class App {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter customer type (residential/commercial/industrial): ");
    	String customerType=sc.nextLine();
    	System.out.println("Enter total units consumed:");
    	int units=Integer.parseInt(sc.nextLine());
    	
    	switch(customerType) {
    	case "residential"->{
    		BillingStrategy bill=ctx.getBean(ResidentialBilling.class);
	      ElectricityBillingSystem bean=ctx.getBean(ElectricityBillingSystem.class);
	      bean.setBillingStrategy(bill);
	      bean.showBill(units);
    	}
    	case "commercial"->{
    		BillingStrategy bean=ctx.getBean(CommercialBilling.class);
  	      ElectricityBillingSystem bean2=ctx.getBean(ElectricityBillingSystem.class);
  	      bean2.setBillingStrategy(bean);
  	      bean2.showBill(units);
    	}
    	case "industrial"->{
    		BillingStrategy bean=ctx.getBean(IndustrialBilling.class);
    	      ElectricityBillingSystem bean2=ctx.getBean(ElectricityBillingSystem.class);
    	      bean2.setBillingStrategy(bean);
    	      bean2.showBill(units);
    	}
    	}
    }
}
