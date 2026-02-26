package com.subrat.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.config.AppConfig;
import com.subrat.sbeans.LaptopService;

public class App {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
       LaptopService ls=ctx.getBean(LaptopService.class);
       ls.printLaptopDetails();
    }
}
