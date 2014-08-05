package com.apress.prospring3.ch4.xml;

import com.apress.prospring3.ch4.MessageProvider;
import com.apress.prospring3.ch4.MessageRenderer;

public class StandardOutMessageRenderer implements MessageRenderer {

	private MessageProvider messageProvider = null;
	
	public void render() {
		// TODO Auto-generated method stub
		if (messageProvider == null) {
			throw new RuntimeException(
					"You must set the property messageProvider of class:"
					+ StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}

	public void setMessageProvider(MessageProvider provider) {
		// TODO Auto-generated method stub
		this.messageProvider = provider;
	}

	public MessageProvider getMessageProvider() {
		// TODO Auto-generated method stub
		return this.messageProvider;
	}

}
