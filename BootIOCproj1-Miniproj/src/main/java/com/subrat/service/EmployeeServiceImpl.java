package com.subrat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.DAO.IEmployeeDAO;
import com.subrat.sbeans.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	public IEmployeeDAO empdao;

	@Override
	public List<Employee> fetchEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception {
		desg1 = desg1.toUpperCase();
		desg2 = desg2.toUpperCase();
		desg3 = desg3.toUpperCase();

		List<Employee> list = empdao.getEmployeeByDesg(desg1, desg2, desg3);
		list.sort((t1, t2) -> t1.getEno().compareTo(t2.getEno()));
		
		return list;
	}

}
