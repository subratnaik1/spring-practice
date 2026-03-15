package com.subrat.repositary;

import java.util.List;

import com.subrat.sbeans.Employee;

public interface IEmpDAO {
	int insertEmployee(Employee employee)throws Exception;
	List<Employee> getAllProducts() throws Exception;
	int deleteemp(int eno) throws Exception;
	int updateemp(Employee product) throws Exception;
}
