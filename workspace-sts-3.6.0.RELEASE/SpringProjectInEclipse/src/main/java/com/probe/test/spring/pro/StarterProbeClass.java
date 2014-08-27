package com.probe.test.spring.pro;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class StarterProbeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		// ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context.xml");
		ctx.refresh();
		ProbeClass pc = (ProbeClass)ctx.getBean("probeClass");
		System.out.println(pc.getField());
		
		System.out.println("that's all!");
	}

}
