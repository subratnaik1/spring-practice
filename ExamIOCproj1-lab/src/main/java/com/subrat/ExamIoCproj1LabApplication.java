package com.subrat;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.subrat.controller.EmpController;
import com.subrat.sbeans.Employee;

@SpringBootApplication
public class ExamIoCproj1LabApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ctx = SpringApplication.run(ExamIoCproj1LabApplication.class, args);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter choice 1>insert \n 2>retrive \n 3>delete \n 4> update");
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1->{
			System.out.println("enter employee no");
			int eno=Integer.parseInt(sc.nextLine());
			System.out.println("enter employee name");
			String name=sc.nextLine();
			System.out.println("enter job");
			String job=sc.nextLine();
			System.out.println("enter employyee salary");
			int salary=Integer.parseInt(sc.nextLine());
			System.out.println("enter dept number");
			int deptno=Integer.parseInt(sc.nextLine());
			
			Employee e=new Employee();
			e.setEno(eno);
			e.setEname(name);
			e.setJob(job);
			e.setSalary(salary);
			e.setDeptno(deptno);
			
			EmpController controller =ctx.getBean("controller",EmpController.class);
			controller.addEmp(e);
		}
		}
	}

}
