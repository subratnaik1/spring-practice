package com.subrat;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.subrat.service.SeasonService;

@SpringBootApplication
public class BootIoCproj1DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootIoCproj1DependencyInjectionApplication.class, args);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month number (1–12):");
		int mNum=Integer.parseInt(sc.nextLine());
		SeasonService ss=ctx.getBean("ss",SeasonService.class);
		System.out.println(ss.getSeason(mNum));
	}

}
