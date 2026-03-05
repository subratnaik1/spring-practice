package com.subrat.sbeans;

public class SMSNotification implements NotificationStrategy {

	@Override
	public void send(String message) {
		System.out.println("Notification Sends message via SMS."+message);
	}

}
