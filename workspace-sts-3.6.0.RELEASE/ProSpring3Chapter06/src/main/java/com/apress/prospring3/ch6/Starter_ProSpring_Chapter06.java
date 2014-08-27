package com.apress.prospring3.ch6;

import org.springframework.aop.framework.ProxyFactory;

import com.apress.prospring3.ch6.security.SecureBean;
import com.apress.prospring3.ch6.security.SecurityExample;
import com.apress.prospring3.ch6.security.SecurityManager;

public class Starter_ProSpring_Chapter06 {

	public static void main(String[] args) {
		// introduction to AOP
		MessageWriter target001 = new MessageWriter();
		// creating a proxy
		ProxyFactory proxyFactory001 = new ProxyFactory();
		proxyFactory001.addAdvice(new MessageDecorator());
		proxyFactory001.setTarget(target001);
		MessageWriter proxiedTarget001 = (MessageWriter)proxyFactory001.getProxy();
		target001.writeMessage();
		System.out.println("");
		proxiedTarget001.writeMessage();
		
		// before advice example
		MessageWriter target002 = new MessageWriter();
		// creating a proxy
		ProxyFactory proxyFactory002 = new ProxyFactory();
		proxyFactory002.addAdvice(new SimpleBeforeAdvice());
		proxyFactory002.setTarget(target002);
		MessageWriter proxiedTarget002 = (MessageWriter)proxyFactory002.getProxy();
		proxiedTarget002.writeMessage();
		
		// secure access to before advice
		SecurityManager securityManager = new SecurityManager();
		SecureBean bean003 = SecurityExample.getSecureBean();
		securityManager.login("clarence", "pwd");
		bean003.writeSecureMessage();
		securityManager.logout();
		try {
			securityManager.login("janm", "pwd");
			bean003.writeSecureMessage();
		} catch(SecurityException ex) {
			System.out.println("Exception Caught: " + ex.getMessage());
		} finally {
			securityManager.logout();
		}
		try {
			bean003.writeSecureMessage();
		} catch (SecurityException ex) {
			System.out.println("Exception Caught: " + ex.getMessage());
		}
	}

}
