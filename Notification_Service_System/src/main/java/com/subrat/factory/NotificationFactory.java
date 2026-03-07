package com.subrat.factory;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.subrat.sbeans.Notifier;

@Component
public class NotificationFactory {
	@Autowired
	private Map<String, Notifier> notifier;

	public Notifier getNotifier(String type) {
		return notifier.get(type);
	}
}
