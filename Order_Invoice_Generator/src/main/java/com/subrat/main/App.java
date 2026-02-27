package com.subrat.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.config.AppConfig;
import com.subrat.sbeans.InvoiceService;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        InvoiceService is= ctx.getBean(InvoiceService.class);
        is.printInvoice();
    }
}
