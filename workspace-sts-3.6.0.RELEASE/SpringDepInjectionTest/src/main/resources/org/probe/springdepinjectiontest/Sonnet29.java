package org.probe.springdepinjectiontest;

public class Sonnet29 implements Poem {
	private static String[] LINES = {
		"aaaaa",
		"bbbbb",
		"ccccc"
	};
	
	public Sonnet29() {
		
	}
	
	public void recite() {
		// TODO Auto-generated method stub
		for (int i = 0; i < LINES.length; i++) {
			System.out.println(LINES[i]);
		}
	}

}
