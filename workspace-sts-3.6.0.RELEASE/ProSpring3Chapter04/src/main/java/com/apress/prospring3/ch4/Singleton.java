package com.apress.prospring3.ch4;

public class Singleton {
	private static Singleton instance;
	static {
		instance = new Singleton();
	}
	public static Singleton getInstance() {
		return instance;
	}
}
