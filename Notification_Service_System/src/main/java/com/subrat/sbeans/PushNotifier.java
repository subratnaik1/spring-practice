package com.subrat.sbeans;

import org.springframework.stereotype.Component;

@Component("push")
public class PushNotifier implements Notifier  {

	@Override
	public void sendNotification(String message) {
    System.out.println("Sending Push Notification:"+message);		
	}

}
