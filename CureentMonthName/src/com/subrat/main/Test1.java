package com.subrat.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.subrat.sbeans.CurrentMonthName;

public class Test1 {
	void main() {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/subrat/config/b.xml");
		CurrentMonthName cmn=ctx.getBean(CurrentMonthName.class);
		IO.println(cmn.getMonth());
	}     
}
