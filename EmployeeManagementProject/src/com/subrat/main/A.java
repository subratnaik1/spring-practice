package com.subrat.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrat.sbeans.Company;

public class A {
	void main() {
    ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/subrat/config/Applicationcontext.xml");
    Company c=ctx.getBean("company",Company.class);
    c.showCompanyInfo();
	}
}
