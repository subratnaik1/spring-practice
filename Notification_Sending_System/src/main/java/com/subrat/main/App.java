package com.subrat.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.config.AppConfig;
import com.subrat.sbeans.EmailNotification;
import com.subrat.sbeans.NotificationService;
import com.subrat.sbeans.NotificationStrategy;
import com.subrat.sbeans.SMSNotification;
import com.subrat.sbeans.WhatsAppNotification;

public class App {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
    	Scanner sc=new Scanner(System.in);
    	System.out.println("nter notification type (email/sms/whatsapp):");
    	String type=sc.nextLine();
    	System.out.println("Enter message:");
    	String message=sc.nextLine();
    	switch(type) {
    	case "email"->{
    		NotificationStrategy bean= ctx.getBean(EmailNotification.class);
    		NotificationService bean2=ctx.getBean(NotificationService.class);
    		bean2.setNotificationStrategy(bean);
    		bean2.notifyUser(message);		
    	}
    	case "sms"->{
    		NotificationStrategy bean= ctx.getBean(SMSNotification.class);
    		NotificationService bean2=ctx.getBean(NotificationService.class);
    		bean2.setNotificationStrategy(bean);
    		bean2.notifyUser(message);

    	}
    	case "whatsapp"->{
    		NotificationStrategy bean= ctx.getBean(WhatsAppNotification.class);
    		NotificationService bean2=ctx.getBean(NotificationService.class);
    		bean2.setNotificationStrategy(bean);
    		bean2.notifyUser(message);
    	}
    	}
    	
    }
}
