package com.subrat.sbeans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component("amazon")
public class AmazonService implements ShoppingService{
    Map<String,List<Double>>items=new HashMap<>();
    
	@Override
	public void addItem(String item, double price) {
		items.computeIfAbsent(item, iteml->new ArrayList<Double>()).add(price);
	}
		
	@Override
	public void checkout() {
		Double totalprice=0.0;
	     for(Map.Entry<String,List< Double>> entry:items.entrySet()) {
	    	 List<Double>total=entry.getValue() ;
	    	 for(Double t:total) {
	    		 totalprice+=t;
	    	 }
	     }	
	     totalprice=totalprice-(totalprice*0.10);
	     System.out.println("fast delivery within 2 days and price="+totalprice);
	}

	@Override
	public void viewCart() {
     for(Map.Entry<String,List< Double>> entry:items.entrySet()) {
    	 System.out.println("product->"+entry.getKey()+" price->"+entry.getValue());
     }
     
	}

}
