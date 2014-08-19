package com.apress.prospring3.ch4.xml;

public class InjectSimpleSpel {
	private String name;
	private int age;
	private float height;
	private boolean isProgrammer;
	private Long ageInSeconds;
	
	public void setAgeInSeconds(Long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}
	
	public void setIsProgrammer(boolean programmer) {
		this.isProgrammer = programmer;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
