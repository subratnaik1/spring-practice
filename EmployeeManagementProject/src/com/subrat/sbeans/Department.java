package com.subrat.sbeans;

import java.util.List;

public class Department {
private String departmentName;
private List<Employee> employees;

public Department(String departmentName, List<Employee> employees) {
	super();
	this.departmentName = departmentName;
	this.employees = employees;
}
public void showDepartmentInfo() {
	IO.println("Department : "+departmentName);
	employees.forEach(emp->emp.showEmployeeDetails());
}

}
