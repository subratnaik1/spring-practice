package com.subrat.service;

import java.util.List;

import com.subrat.sbeans.Employee;

public interface IEmpService {
	int addEmp(Employee emp) throws Exception;

	List<Employee> retrieveAllProducts() throws Exception;

	int deleteemp(int eno)throws Exception;

	int updateemp(Employee emp) throws Exception;
}
