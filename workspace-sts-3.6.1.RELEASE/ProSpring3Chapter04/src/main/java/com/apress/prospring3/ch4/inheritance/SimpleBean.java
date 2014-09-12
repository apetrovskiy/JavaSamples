package com.apress.prospring3.ch4.inheritance;

public class SimpleBean {
	public String name;
	public int age;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "Name: " + name + "\n" + "Age: " + age; 
	}
}
