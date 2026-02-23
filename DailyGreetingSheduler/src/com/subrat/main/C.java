package com.subrat.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.subrat.sbean.TimeService;

public class C {
	void main() {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/subrat/config/c.xml");
		TimeService ts=ctx.getBean("ds",TimeService.class);
		IO.println(ts.show());
	}
}
