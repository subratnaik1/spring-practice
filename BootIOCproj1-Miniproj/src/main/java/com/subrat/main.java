package com.subrat;
import java.util.List;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.subrat.controller.payrollOperationCalculator;
import com.subrat.sbeans.Employee;

@SpringBootApplication
public class main {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(main.class, args);
		payrollOperationCalculator controller = ctx.getBean("payroll", payrollOperationCalculator.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter desg 1");
		String desg1=sc.nextLine();
		System.out.println("enter desg 2");
		String desg2=sc.nextLine();
		System.out.println("enter desg 3");
		String desg3=sc.nextLine();

		try {
			List<Employee> list = controller.showAllEmployeesByDesgs(desg1, desg2, desg3);
			System.out.println("employee belonging to "+desg1+" "+desg2+" "+desg3+" are");
			 list.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ctx.close();
	}

}
