package com.apress.prospring3.ch5;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.apress.prospring3.ch5.lifecycle.SimpleBean;
import com.apress.prospring3.ch5.lifecycle.SimpleBeanWithInterface;

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
		
		GenericXmlApplicationContext ctx003 = new GenericXmlApplicationContext();
		ctx003.load("classpath:META-INF/spring/lifecycle/initMethod.xml");
		ctx003.refresh();
		SimpleBeanWithInterface simpleBean01 = SimpleBeanWithInterface.getBean("simpleBean01", ctx003);
		SimpleBeanWithInterface simpleBean02 = SimpleBeanWithInterface.getBean("simpleBean02", ctx003);
		// this works
		// SimpleBeanWithInterface simpleBean03 = SimpleBeanWithInterface.getBean("simpleBean03", ctx003);
		
		System.out.println("that's all!");
	}

}
