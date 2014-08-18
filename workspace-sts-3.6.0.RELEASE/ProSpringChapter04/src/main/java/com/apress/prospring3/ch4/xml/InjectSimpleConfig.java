package com.apress.prospring3.ch4.xml;

import org.springframework.beans.factory.annotation.Value;

public class InjectSimpleConfig {
	private String name = "John Smith";
	private int age = 35;
	private float height = 1.78f;
	private boolean programmer = true;
	private Long ageInSeconds = 1103760000L;
	
	public void setAgeInSeconds(Long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}
	
	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
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
	
	public Long getAgeInSeconds() {
		return ageInSeconds;
	}
	
	public boolean getProgrammer() {
		return programmer;
	}
	
	public int getAge() {
		return age;
	}
	
	public float getHeight() {
		return height;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Name: " + name + "\n"
				+ "Age: " + age + "\n"
				+ "Age in Seconds: " + ageInSeconds + "\n"
				+ "Height: " + height + "\n"
				+ "Is Programmer?: " + programmer;
	}
}
