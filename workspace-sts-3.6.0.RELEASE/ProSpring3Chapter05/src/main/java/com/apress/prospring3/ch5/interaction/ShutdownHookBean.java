package com.apress.prospring3.ch5.interaction;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericApplicationContext;

public class ShutdownHookBean implements ApplicationContextAware {

	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		// TODO Auto-generated method stub
		if (ctx instanceof GenericApplicationContext) {
			((GenericApplicationContext)ctx).registerShutdownHook();
		}
	}

}
