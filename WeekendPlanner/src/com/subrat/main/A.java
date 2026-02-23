package com.subrat.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.subrat.sbeans.DateService;

public class A {
	void main() {
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/subrat/config/NewFile.xml");
		DateService d= ctx.getBean("ds",DateService.class);	
		IO.println(d.getWeekDays());
	}
   
}
