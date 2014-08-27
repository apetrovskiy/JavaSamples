package com.apress.prospring3.ch6;

import org.springframework.aop.framework.ProxyFactory;

public class Starter_ProSpring_Chapter06 {

	public static void main(String[] args) {
		MessageWriter target = new MessageWriter();
		
		// creating a proxy
		ProxyFactory proxyFactory = new ProxyFactory();
		
		proxyFactory.addAdvice(new MessageDecorator());
		proxyFactory.setTarget(target);
		
		MessageWriter proxiedTarget = (MessageWriter)proxyFactory.getProxy();
		
		target.writeMessage();
		System.out.println("");
		proxiedTarget.writeMessage();
	}

}
