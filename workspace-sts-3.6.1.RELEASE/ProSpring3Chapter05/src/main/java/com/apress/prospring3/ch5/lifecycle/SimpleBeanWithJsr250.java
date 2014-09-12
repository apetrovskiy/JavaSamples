package com.apress.prospring3.ch5.lifecycle;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;

public class SimpleBeanWithJsr250 {
	private static final String DEFAULT_NAME = "Luke Skywalker";
	private String name = null;
	private int age = Integer.MIN_VALUE;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@PostConstruct
	public void init() {
		System.out.println("Initializing bean");
		if (name == null) {
			System.out.println("Using default name");
			name = DEFAULT_NAME;
		}
		if (age == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("You must set the age property of any beans of type " + SimpleBean.class);
		}
	}
	public String toString() {
		return "Name: " + name + "\nAge: " + age;
	}
	public static SimpleBeanWithJsr250 getBean(String beanName, ApplicationContext ctx) {
		try {
			SimpleBeanWithJsr250 bean = (SimpleBeanWithJsr250)ctx.getBean(beanName);
			System.out.println(bean);
			return bean;
		} catch (BeanCreationException ex) {
			System.out.println("An error occured in bean configuration: " + ex.getMessage());
			return null;
		}
	}
}
