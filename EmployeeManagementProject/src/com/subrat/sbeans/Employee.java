package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private String employeeId;
	private String employeeName;
	private Project project;
	
	public Employee(String employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	@Autowired
	@Qualifier("project1")
	public void setProject(Project project) {
		this.project = project;
	}
	public void showEmployeeDetails() {
		IO.print("Employee: "+employeeName+" | ");
		project.showProjectDetails();
	}
	
	
}
