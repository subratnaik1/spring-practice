package com.subrat.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrat.sbeans.Librarian;

public class A {
void main() {	
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/subrat/config/a.xml");
	Librarian lb=ctx.getBean("Librarian",Librarian.class);
	lb.manageLibrary();			
}
}
