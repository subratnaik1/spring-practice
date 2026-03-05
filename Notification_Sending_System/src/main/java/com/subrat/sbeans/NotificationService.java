package com.subrat.sbeans;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
	private NotificationStrategy notificationStrategy;
		
	public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
		this.notificationStrategy = notificationStrategy;
	}

	public void  notifyUser(String message) {
		notificationStrategy.send(message);
	}
}
