package com.subrat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.subrat.sbeans.Employee;

import com.subrat.service.IEmpService;

@Controller("controller")
public class EmpController {
	@Autowired
	private IEmpService iempService;

	public int addEmp(Employee emp) throws Exception {

		return iempService.addEmp(emp);
	}

	public int updateProduct(Employee emp) throws Exception {

		return iempService.updateemp(emp);
	}
}
