package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalarySlipService {
	@Autowired
	private Employee employee;

	public void generateSlip() {
		double grossSalary =employee.getBasicSalary() + employee.getHra()+ employee.getDa();
				double taxAmount = (grossSalary * employee.getTaxPercentage() / 100);
				double netSalary = grossSalary - taxAmount;	
				
				System.out.println("Salary slip for "+employee.getName());
				System.out.println("gross salary: "+grossSalary);
				System.out.println("Tax deducted :"+(grossSalary-netSalary));
				System.out.println("Net Salary "+netSalary);
				
	}

}
