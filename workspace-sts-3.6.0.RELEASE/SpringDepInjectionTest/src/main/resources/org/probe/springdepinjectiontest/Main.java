package org.probe.springdepinjectiontest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("org/probe/springdepinjectiontest/app-context.xml");
		
		Performer performer = (Performer)ctx.getBean("duke");
		performer.perform();
		
		performer = (Performer)ctx.getBean("poeticDuke");
		performer.perform();
		
		performer = (Performer)ctx.getBean("kenny2");
		performer.perform();
		
		performer = (Performer)ctx.getBean("hank");
		performer.perform();
		
		performer = (Performer)ctx.getBean("carl");
		performer.perform();
		
		TestSpel01 testSpel01 = (TestSpel01)ctx.getBean("testPi");
		System.out.println(testSpel01.getPi());
	}

}
