package com.subrat.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.config.AppConfig;
import com.subrat.sbeans.SalarySlipService;

public class App {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
       SalarySlipService sss=ctx.getBean(SalarySlipService.class);
       sss.generateSlip();
    }
}
