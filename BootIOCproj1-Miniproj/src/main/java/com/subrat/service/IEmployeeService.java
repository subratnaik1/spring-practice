package com.subrat.service;

import java.util.List;

import com.subrat.sbeans.Employee;

public interface IEmployeeService {
	public List<Employee> fetchEmployeeByDesgs(String desg1, String desg2, String Desg3) throws Exception;
}
