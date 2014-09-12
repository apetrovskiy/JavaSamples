package org.probe.springdepinjectiontest;

// import org.springframework.context.ApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Starter_SpringInAction3rd_Chapter03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("org/probe/springdepinjectiontest/app-context.xml");
		GenericXmlApplicationContext ctx001 = new GenericXmlApplicationContext();
		ctx001.load("classpath:META-INF/spring/app-context.xml");
		ctx001.refresh();
		
		Performer performer = (Performer)ctx001.getBean("kenny");
		performer.perform();
		
		performer = (Performer)ctx001.getBean("david");
		performer.perform();
		
		performer = (Performer)ctx001.getBean("frank");
		performer.perform();
		
		performer = (Performer)ctx001.getBean("taylor");
		performer.perform();
		
		performer = (Performer)ctx001.getBean("stevie");
		performer.perform();
	}

}
