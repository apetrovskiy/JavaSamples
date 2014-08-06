package com.apress.prospring3.ch4.xml;

import com.apress.prospring3.ch4.MessageProvider;
import org.springframework.beans.factory.annotation.Value;

public class ConfigurableMessageProvider implements MessageProvider {
	
	private String message;
	
	public ConfigurableMessageProvider(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

}
