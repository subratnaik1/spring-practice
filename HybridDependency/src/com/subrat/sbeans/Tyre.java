package com.subrat.sbeans;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
     private String brand;
     private String size;
     
	 public void setBrand(String brand) {
		 this.brand = brand;
	 }
	 public void setSize(String size) {
		 this.size = size;
	 }
     
	 public String showTyreDetails() {
		 return "brand is "+this.brand+"size is "+this.size+"";
	 }
     
}
