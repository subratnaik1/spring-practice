package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
	@Autowired
	private Product product;
	@Autowired
	private TaxCalculator taxcalculator;

	public void printInvoice() {
   double total=product.getPrice()*product.getQuantity();
   double tax=taxcalculator.calculateTax(total);
   double finalAmount=total+tax;
   System.out.println("Invoice :");
   System.out.println("product :"+product.getName());
   System.out.println("Quantity: "+product.getQuantity());
   System.out.println("total (before Tax):"+total);
   System.out.println("Tax :"+tax);
   System.out.println("Final amount :"+finalAmount);
   
	}

}
