package org.probe.springdepinjectiontest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter_SpringInAction3rd_Chapter02 {

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
		
		SpringTest01 springTest01 = (SpringTest01)ctx.getBean("testPi");
		System.out.println(springTest01.getPi());
	}

}
