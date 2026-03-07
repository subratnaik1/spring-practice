package com.subrat.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrat.config.AppConfig;
import com.subrat.factory.NotificationFactory;
import com.subrat.sbeans.Notifier;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter (email/sms/push)");
		String type = sc.nextLine();
		System.out.println("enter message");
		String msg = sc.nextLine();
		NotificationFactory note = ctx.getBean(NotificationFactory.class);
		Notifier n = note.getNotifier(type);
		n.sendNotification(msg);
	}
}
