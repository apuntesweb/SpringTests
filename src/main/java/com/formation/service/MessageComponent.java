package com.formation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageComponent {
	
	@Autowired
	private MessageService service;
	
	public String getMessage() {
		return service.getMessage();
	}
}
