package com.apress.prospring3.ch4.mi;

import org.springframework.util.StopWatch;

public class MethodReplacementExample {
	public static void displayInfo(ReplacementTarget target) {
		System.out.println(target.formatMessage("Hello World!"));
		StopWatch stopWatch = new StopWatch();
		stopWatch.start("perfTest");
		for(int x = 0; x < 1000000; x++) {
			String out = target.formatMessage("foo");
		}
		stopWatch.stop();
		System.out.println("1000000 invocations took: " + stopWatch.getTotalTimeMillis() + " ms");
	}
}
