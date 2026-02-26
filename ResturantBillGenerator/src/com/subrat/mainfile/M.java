package com.subrat.mainfile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.sbeans.ResturantBill;

import subrat.com.config.AppConfig;

public class M {
void main() {
	AnnotationConfigApplicationContext ctx=new 	AnnotationConfigApplicationContext(AppConfig.class);
	ResturantBill rb=ctx.getBean(ResturantBill.class);
	double finalbill=rb.generateFinalBill();
	IO.println("Final Restaurant Bill: "+finalbill);
}
}
