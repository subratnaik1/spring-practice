package com.subrat.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.subrat.sbeans.SchedulerService;

public class D {
	void main() {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/subrat/config/d.xml");
        SchedulerService ss = ctx.getBean("ds",SchedulerService.class);
        IO.println(ss.show());
	}
}
