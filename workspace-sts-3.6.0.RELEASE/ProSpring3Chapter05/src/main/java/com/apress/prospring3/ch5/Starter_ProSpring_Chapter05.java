package com.apress.prospring3.ch5;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.apress.prospring3.ch5.lifecycle.DestructiveBean;
import com.apress.prospring3.ch5.lifecycle.DestructiveBeanWithInterface;
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
		
		System.out.println("that's all!");
	}

}
