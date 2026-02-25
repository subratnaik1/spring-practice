package com.subrat.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrat.sbeans.ServiceCenter;

public class E {
	void main() {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/subrat/config/e.xml");
		ServiceCenter sc=ctx.getBean("servicecenter",ServiceCenter.class);
		IO.println(sc.performService("full Engine checkup"));
	}
}
