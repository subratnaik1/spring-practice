package com.subrat.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.subrat.sbeans.CalendarService;

public class SetterInjectionTest {
	void main() {
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/subrat/cfg/a.xml");
	CalendarService cs=ctx.getBean("ds",CalendarService.class);
	IO.println(cs.getDate());

	}
}
