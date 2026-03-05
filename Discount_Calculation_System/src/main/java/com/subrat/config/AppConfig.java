package com.subrat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.subrat.sbeans.EliteCustomerDiscount;
import com.subrat.sbeans.PremiumCustomerDiscount;
import com.subrat.sbeans.RegularCustomerDiscount;

@Configuration
@ComponentScan("com.subrat.sbeans")
public class AppConfig {
	
    @Bean("regularCustomerDiscount")
	public RegularCustomerDiscount regularCustomerDiscount() {
		return new RegularCustomerDiscount();
	}
     @Bean("premiumCustomerDiscount")
     public PremiumCustomerDiscount premiumCustomerDiscount() {
    	 return new PremiumCustomerDiscount();
     }
     @Bean("eliteCustomerDiscount")
	public EliteCustomerDiscount eliteCustomerDiscount() {
		return new EliteCustomerDiscount();
	}
}
