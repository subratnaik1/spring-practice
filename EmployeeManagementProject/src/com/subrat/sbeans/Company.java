package com.subrat.sbeans;

import java.util.Map;

public class Company {
	private String companyName;
	private Map<String, Department> department;
	
	public Company(String companyName, Map<String, Department> department) {
		super();
		this.companyName = companyName;
		this.department = department;
	}
	
	public void showCompanyInfo() {
	    System.out.println("=== Company Structure ===");
	    System.out.println("Company: " + companyName);
	    department.forEach((key, value) -> {
//	        System.out.println("Department: " + key);
	        value.showDepartmentInfo();
	    });
	}
}
