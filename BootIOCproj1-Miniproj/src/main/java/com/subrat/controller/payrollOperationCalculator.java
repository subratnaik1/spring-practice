package com.subrat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.subrat.sbeans.Employee;
import com.subrat.service.IEmployeeService;
@Controller("payroll")
public class payrollOperationCalculator {
	
	@Autowired
	private IEmployeeService service;
	
	public List<Employee> showAllEmployeesByDesgs(String desg1,String desg2,String desg3)throws Exception{
		List<Employee> list=service.fetchEmployeeByDesgs(desg1, desg2, desg3);
		return list;
		
	}

}
