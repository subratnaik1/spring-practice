package com.subrat.sbeans;

import org.springframework.stereotype.Component;

@Component
public interface MessageService {
	void send(String message);

}
