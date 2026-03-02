package com.subrat.sbeans;

import org.springframework.stereotype.Component;

@Component("whatsAppService")
public class WhatsAppService implements MessageService {

	@Override
	public void send(String message) {
		System.out.println("WhatsApp sent: <"+message+">");
	}

}
