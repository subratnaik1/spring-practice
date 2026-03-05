package com.subrat.sbeans;

public class EmailNotification implements NotificationStrategy{

	@Override
	public void send(String message) {
		System.out.println("Notification Sends message via Email."+message);
	}

}
