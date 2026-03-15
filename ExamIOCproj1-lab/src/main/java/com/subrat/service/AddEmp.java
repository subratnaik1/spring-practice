package com.subrat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.repositary.IEmpDAO;
import com.subrat.sbeans.Employee;

@Service("service")
public class AddEmp implements IEmpService {
   @Autowired
	private IEmpDAO iempDAO;

	@Override
	public int addEmp(Employee emp) throws Exception {

		return iempDAO.insertEmployee(emp);
	}
	@Override
	public int updateemp(Employee emp) throws Exception {

		return iempDAO.updateemp(emp);
	}
	@Override
	public List<Employee> retrieveAllProducts() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int deleteemp(int eno) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
