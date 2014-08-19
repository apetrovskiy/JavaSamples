package com.apress.prospring3.ch4.annotation;

import com.apress.prospring3.ch4.MessageProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {
	
	private String message;
	
	@Autowired
	public ConfigurableMessageProvider(@Value("This is a configurable message (the annotation style)")String message) {
		this.message = message;
	}
	
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
