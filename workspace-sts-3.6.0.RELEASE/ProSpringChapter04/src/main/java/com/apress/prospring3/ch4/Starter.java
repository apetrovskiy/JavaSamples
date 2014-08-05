package com.apress.prospring3.ch4;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
/* import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; */
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Starter {

	public static void main(String[] args) {
		// BeanFactory
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
		rdr.loadBeanDefinitions(new FileSystemResource("src/main/resources/xmlBeanFactory.xml"));
		
		//Oracle oracle = (Oracle)factory.getBean("oracle");
		Oracle oracle = factory.getBean("oracle", Oracle.class);
		System.out.println(oracle.defineMeaningOfLife());
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// ApplicationContext
		// ApplicationContext ctx1 = new ClassPathXmlApplicationContext("META-INF/spring/app-context-xml.xml");
		// ApplicationContext ctx1 = new ClassPathXmlApplicationContext("classpath:META-INF/spring/app-context-annotation.xml");
		GenericXmlApplicationContext ctx1 = new GenericXmlApplicationContext();
		ctx1.load("classpath:META-INF/spring/app-context-xml.xml");
		ctx1.refresh();
		MessageProvider mp = ctx1.getBean("messageProvider", MessageProvider.class);
		System.out.println(mp.getMessage());
		MessageRenderer mr = ctx1.getBean("messageRenderer", MessageRenderer.class);
		// mr.setMessageProvider(mp);
		mr.render();
		
		// ctx2 = new ClassPathXmlApplicationContext("META-INF/spring/app-context-annotation.xml");
		GenericXmlApplicationContext ctx2 = new GenericXmlApplicationContext();
		ctx2.load("classpath:META-INF/spring/app-context-annotation.xml");
		// ctx2.load("classpath:META-INF/spring/app-context-xml.xml");
		ctx2.refresh();
		mp = ctx2.getBean("messageProvider", MessageProvider.class);
		System.out.println(mp.getMessage());
		mr = ctx2.getBean("messageRenderer", MessageRenderer.class);
		// mr.setMessageProvider(mp);
		mr.render();
	}

}
