package com.apress.prospring3.ch5;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.apress.prospring3.ch5.lifecycle.SimpleBean;

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
		
		
		System.out.println("that's all!");
	}

}
