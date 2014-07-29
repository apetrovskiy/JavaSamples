package org.probing.springdependencyinjectionxmltest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("org/probing/springdependencyinjectionxmltest/app-context.xml");
		
		Performer performer = (Performer)ctx.getBean("duke");
		performer.perform();
	}

}
