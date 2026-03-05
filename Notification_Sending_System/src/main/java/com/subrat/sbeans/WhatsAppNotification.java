package com.subrat.sbeans;

public class WhatsAppNotification implements NotificationStrategy{

	@Override
	public void send(String message) {
    System.out.println("Notification Sends message via WhatsApp."+message);		
	}

}
