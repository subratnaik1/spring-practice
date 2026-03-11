package com.subrat.DAO;

import java.util.List;

import com.subrat.sbeans.Employee;

public interface IEmployeeDAO {
public List<Employee> getEmployeeByDesg(String desg1,String desg2,String desg3)throws Exception;
}
