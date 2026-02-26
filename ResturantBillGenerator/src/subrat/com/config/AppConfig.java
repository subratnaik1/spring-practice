package subrat.com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.subrat.sbeans.ResturantBill;

@Configuration
public class AppConfig {
	@Bean
	public ResturantBill resturantBillGenerator() {
		ResturantBill rb=new ResturantBill();
		rb.setFoodAmount(800);
		rb.setDrinksAmount(200);
		rb.setServiceCharge(50);
		rb.setGstPercentage(18);		
		return rb;
	}
}
