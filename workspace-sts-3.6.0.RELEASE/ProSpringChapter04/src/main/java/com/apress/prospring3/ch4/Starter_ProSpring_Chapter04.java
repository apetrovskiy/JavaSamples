package com.apress.prospring3.ch4;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;
/* import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; */
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;



import com.apress.prospring3.ch4.annotation.ConstructorConfusion;
// import com.apress.prospring3.ch4.xml.ConstructorConfusion;
import com.apress.prospring3.ch4.xml.*;

public class Starter_ProSpring_Chapter04 {

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
		
		GenericXmlApplicationContext ctx001 = new GenericXmlApplicationContext();
		ctx001.load("classpath:META-INF/spring/app-context-xml.xml");
		ctx001.refresh();
		MessageProvider mp = ctx001.getBean("messageProvider", MessageProvider.class);
		System.out.println(mp.getMessage());
		MessageRenderer mr = ctx001.getBean("messageRenderer", MessageRenderer.class);
		// mr.setMessageProvider(mp);
		mr.render();
		
		// ctx2 = new ClassPathXmlApplicationContext("META-INF/spring/app-context-annotation.xml");
		GenericXmlApplicationContext ctx002 = new GenericXmlApplicationContext();
		ctx002.load("classpath:META-INF/spring/app-context-annotation.xml");
		// ctx2.load("classpath:META-INF/spring/app-context-xml.xml");
		ctx002.refresh();
		
		mp = ctx002.getBean("messageProvider", MessageProvider.class);
		System.out.println(mp.getMessage());
		mr = ctx002.getBean("messageRenderer", MessageRenderer.class);
		// mr.setMessageProvider(mp);
		mr.render();
		
		// again XML
		GenericXmlApplicationContext ctx003 = new GenericXmlApplicationContext();
		// ctx3.load("classpath:app-context-xml.xml");
		ctx003.load("classpath:META-INF/spring/app-context-xml.xml");
		ctx003.refresh();
		com.apress.prospring3.ch4.xml.ConstructorConfusion cc1 = (com.apress.prospring3.ch4.xml.ConstructorConfusion)ctx003.getBean("constructorConfusion");
		System.out.println(cc1);
		
		
		// again annotation
		GenericXmlApplicationContext ctx004 = new GenericXmlApplicationContext();
		ctx004.load("classpath:META-INF/spring/app-context-annotation.xml");
		ctx004.refresh();
		com.apress.prospring3.ch4.annotation.ConstructorConfusion cc2 = (com.apress.prospring3.ch4.annotation.ConstructorConfusion)ctx004.getBean("constructorConfusion");
		System.out.println(cc2);
		
		// again XML
		GenericXmlApplicationContext ctx005 = new GenericXmlApplicationContext();
		// ctx5.load("classpath:app-context-xml.xml");
		ctx005.load("classpath:META-INF/spring/app-context-xml.xml");
		ctx005.refresh();
		com.apress.prospring3.ch4.xml.InjectSimple simple1 = (com.apress.prospring3.ch4.xml.InjectSimple)ctx005.getBean("injectSimple");
		System.out.println(simple1);
		
		// again annotation
		GenericXmlApplicationContext ctx006 = new GenericXmlApplicationContext();
		ctx006.load("classpath:META-INF/spring/app-context-annotation.xml");
		ctx006.refresh();
		com.apress.prospring3.ch4.annotation.InjectSimple simple2 = (com.apress.prospring3.ch4.annotation.InjectSimple)ctx006.getBean("injectSimple");
		System.out.println(simple2);
		
		// SpEL XML
		GenericXmlApplicationContext ctx007 = new GenericXmlApplicationContext();
		ctx007.load("classpath:META-INF/spring/app-context-xml.xml");
		ctx007.refresh();
		com.apress.prospring3.ch4.xml.InjectSimpleSpel simpleSpel01 = (com.apress.prospring3.ch4.xml.InjectSimpleSpel)ctx007.getBean("injectSimpleSpel");
		System.out.println(simpleSpel01);
		
		// SpEL annotation
		GenericXmlApplicationContext ctx008 = new GenericXmlApplicationContext();
		ctx008.load("classpath:META-INF/spring/app-context-annotation.xml");
		ctx008.refresh();
		com.apress.prospring3.ch4.annotation.InjectSimpleSpel simpleSpel02 = (com.apress.prospring3.ch4.annotation.InjectSimpleSpel)ctx008.getBean("injectSimpleSpel");
		System.out.println(simpleSpel02);
		
		// inject ref XML
		GenericXmlApplicationContext ctx009 = new GenericXmlApplicationContext();
		ctx009.load("classpath:META-INF/spring/app-context-xml.xml");
		ctx009.refresh();
		com.apress.prospring3.ch4.xml.InjectRef injectRef01 = (com.apress.prospring3.ch4.xml.InjectRef)ctx009.getBean("injectRef");
		System.out.println(injectRef01);
		
		// nested ApplicationContext
		GenericXmlApplicationContext parentContext = new GenericXmlApplicationContext();
		parentContext.load("classpath:parent.xml");
		parentContext.refresh();
		GenericXmlApplicationContext childContext = new GenericXmlApplicationContext();
		childContext.load("classpath:app-context-xml.xml");
		childContext.setParent(parentContext);
		childContext.refresh();
		// SimpleTarget target1 = (SimpleTarget)childContext.getBean("target1");
		SimpleTarget target2 = (SimpleTarget)childContext.getBean("target2");
		// SimpleTarget target3 = (SimpleTarget)childContext.getBean("target3");
		// System.out.println(target1.getVal());
		System.out.println(target2.getVal());
		// System.out.println(target3.getVal());
		
		System.out.println("that's all");
	}

}
