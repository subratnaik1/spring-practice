package com.subrat.repositary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.subrat.sbeans.Employee;
@Repository("repositary")
public class EmpDAO implements IEmpDAO {
	@Autowired
	private DataSource ds;
	public static final String insertEmp = "insert into emp values (?,?,?,?,?)";
	public static final String updateEmp = "update emp set(eno=?,ename=?,job=?,salary=?,deptno=?)";
	public static final String RETRIVE_PRODUCT = "SELECT * FROM emp";
    public static final String Delete_product="DELETE FROM emp WHERE eno=?";

	@Override
	public int insertEmployee(Employee employee) throws Exception {
		int rowCount = 0;
		try (Connection con = ds.getConnection()) {
			PreparedStatement pstmt = con.prepareStatement(insertEmp);
			pstmt.setInt(1, employee.getEno());
			pstmt.setString(2, employee.getEname());
			pstmt.setString(3, employee.getJob());
			pstmt.setInt(4, employee.getSalary());
			pstmt.setInt(5,employee.getDeptno());
			
			rowCount=pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
	public int UpdateEmployee(Employee employee)throws Exception{
		int rowCount=0;
		 try(Connection con=ds.getConnection()){
		    	PreparedStatement pstmt= con.prepareStatement(updateEmp); 
		    	pstmt.setInt(1, employee.getEno());
				pstmt.setString(2, employee.getEname());
				pstmt.setString(3, employee.getJob());
				pstmt.setInt(4, employee.getSalary());
				pstmt.setInt(5,employee.getDeptno());
				rowCount=pstmt.executeUpdate();
		    	
	}
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 return rowCount;
}
	@Override
	public List<Employee> getAllProducts() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int deleteemp(int eno) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updateemp(Employee product) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
}