package com.apress.prospring3.ch5;

import java.security.MessageDigest;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.apress.prospring3.ch5.factory.MessageDigestFactoryBean;
import com.apress.prospring3.ch5.factory.MessageDigester;
import com.apress.prospring3.ch5.interaction.LoggingBean;
import com.apress.prospring3.ch5.lifecycle.DestructiveBean;
import com.apress.prospring3.ch5.lifecycle.DestructiveBeanWithInterface;
import com.apress.prospring3.ch5.lifecycle.DestructiveBeanWithJsr250;
import com.apress.prospring3.ch5.lifecycle.SimpleBean;
import com.apress.prospring3.ch5.lifecycle.SimpleBeanWithInterface;
import com.apress.prospring3.ch5.lifecycle.SimpleBeanWithJsr250;

public class Starter_ProSpring_Chapter05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx001 = new GenericXmlApplicationContext();
		// ctx001.load("classpath:lifecycle/initMethod.xml");
		ctx001.load("classpath:META-INF/spring/lifecycle/initMethod.xml");
		ctx001.refresh();
		SimpleBean simpleBean1 = SimpleBean.getBean("simpleBean1", ctx001);
		SimpleBean simpleBean2 = SimpleBean.getBean("simpleBean2", ctx001);
		// this works
		// SimpleBean simpleBean3 = SimpleBean.getBean("simpleBean3", ctx001);
		
		GenericXmlApplicationContext ctx002 = new GenericXmlApplicationContext();
		ctx002.load("classpath:META-INF/spring/lifecycle/initMethod.xml");
		ctx002.refresh();
		SimpleBeanWithInterface simpleBean01 = SimpleBeanWithInterface.getBean("simpleBean01", ctx002);
		SimpleBeanWithInterface simpleBean02 = SimpleBeanWithInterface.getBean("simpleBean02", ctx002);
		// this works
		// SimpleBeanWithInterface simpleBean03 = SimpleBeanWithInterface.getBean("simpleBean03", ctx003);
		/*
		// this does not work
		GenericXmlApplicationContext ctx003 = new GenericXmlApplicationContext();
		ctx003.load("classpath:META-INF/spring/lifecycle/initMethod.xml");
		ctx003.refresh();
		SimpleBeanWithJsr250 simpleBean001 = SimpleBeanWithJsr250.getBean("simpleBean001", ctx003);
		SimpleBeanWithJsr250 simpleBean002 = SimpleBeanWithJsr250.getBean("simpleBean002", ctx003);
		// this works
		SimpleBeanWithJsr250 simpleBean003 = SimpleBeanWithJsr250.getBean("simpleBean003", ctx003);
		*/
		
		GenericXmlApplicationContext ctx005 = new GenericXmlApplicationContext();
		// ctx005.load("classpath:lifecycle/disposeMethod.xml");
		ctx005.load("classpath:META-INF/spring/lifecycle/disposeMethod.xml");
		ctx005.refresh();
		DestructiveBean bean005 = (DestructiveBean)ctx005.getBean("destructiveBean005");
		System.out.println("Calling destroy()");
		ctx005.destroy();
		System.out.println("Called destroy()");
		
		GenericXmlApplicationContext ctx006 = new GenericXmlApplicationContext();
		// ctx006.load("classpath:lifecycle/disposeInterface.xml");
		ctx006.load("classpath:META-INF/spring/lifecycle/disposeInterface.xml");
		ctx006.refresh();
		DestructiveBeanWithInterface bean006 = (DestructiveBeanWithInterface)ctx006.getBean("destructiveBean006");
		System.out.println("Calling destroy()");
		ctx006.destroy();
		System.out.println("Called destroy()");
		
		GenericXmlApplicationContext ctx007 = new GenericXmlApplicationContext();
		// ctx007.load("classpath:lifecycle/disposeJsr250.xml");
		ctx007.load("classpath:META-INF/spring/lifecycle/disposeJsr250.xml");
		ctx007.refresh();
		DestructiveBeanWithJsr250 bean007 = (DestructiveBeanWithJsr250)ctx007.getBean("destructiveBean007");
		System.out.println("Calling destroy()");
		ctx007.destroy();
		System.out.println("Called destroy()");
		
		GenericXmlApplicationContext ctx008 = new GenericXmlApplicationContext();
		// ctx008.load("classpath:lifecycle/disposeInterface.xml");
		ctx008.load("classpath:META-INF/spring/lifecycle/disposeInterface.xml");
		ctx008.registerShutdownHook();
		ctx008.refresh();
		DestructiveBeanWithInterface bean008 = (DestructiveBeanWithInterface)ctx008.getBean("destructiveBean006");
		
		GenericXmlApplicationContext ctx009 = new GenericXmlApplicationContext();
		// ctx009.load("classpath:interaction/logging.xml");
		ctx009.load("classpath:META-INF/spring/interaction/logging.xml");
		ctx009.refresh();
		LoggingBean bean009 = (LoggingBean)ctx009.getBean("loggingBean");
		bean009.someOperation();
		
		GenericXmlApplicationContext ctx010 = new GenericXmlApplicationContext();
		// ctx010.load("classpath:interaction/shutdownHook.xml");
		ctx010.load("classpath:META-INF/spring/interaction/shutdownHook.xml");
		ctx010.refresh();
		DestructiveBeanWithInterface bean010 = (DestructiveBeanWithInterface)ctx010.getBean("destructiveBean");
		
		GenericXmlApplicationContext ctx011 = new GenericXmlApplicationContext();
		// ctx011.load("classpath:factory/factory.xml");
		ctx011.load("classpath:META-INF/spring/factory/factory.xml");
		ctx011.refresh();
		MessageDigester digester011 = (MessageDigester)ctx011.getBean("digester");
		digester011.digest("Hello World!");
		
		GenericXmlApplicationContext ctx012 = new GenericXmlApplicationContext();
		// ctx012.load("classpath:factory/factory.xml");
		ctx012.load("classpath:META-INF/spring/factory/factory.xml");
		ctx012.refresh();
		MessageDigest digest012 = (MessageDigest)ctx012.getBean("shaDigest");
		MessageDigestFactoryBean factoryBean = (MessageDigestFactoryBean)ctx012.getBean("&shaDigest");
		try {
			MessageDigest shaDigest = factoryBean.getObject();
			System.out.println(shaDigest.digest("Hello world".getBytes()));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		GenericXmlApplicationContext ctx013 = new GenericXmlApplicationContext();
		// ctx013.load("classpath:factory/factoryMethod.xml");
		ctx013.load("classpath:META-INF/spring/factory/factoryMethod.xml");
		ctx013.refresh();
		MessageDigester digester013 = (MessageDigester)ctx013.getBean("digester");
		digester013.digest("Hello World!");
		
		System.out.println("that's all!");
	}

}
