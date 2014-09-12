package com.apress.prospring3.ch4.mi;

import org.springframework.util.StopWatch;

public class LookupDemo {
	public static void displayInfo(DemoBean bean) {
		MyHelper helper1 = bean.getMyHelper();
		MyHelper helper2 = bean.getMyHelper();
		System.out.println("Helper Instances the Same?: " + (helper1 == helper2));
		StopWatch stopWatch = new StopWatch();
		stopWatch.start("lookupDemo");
		for(int x = 0; x < 100000; x++) {
			MyHelper helper = bean.getMyHelper();
			helper.doSomethingHelpful();
		}
		stopWatch.stop();
		System.out.println("100000 gets took " + stopWatch.getTotalTimeMillis() + " ms");
	}
}
