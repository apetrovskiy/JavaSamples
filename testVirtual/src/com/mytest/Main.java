package com.mytest;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee e01 = new Employee(10);
        System.out.println(e01.getSalary());
        System.out.println(e01.getInt());
        Manager m01 = new Manager(10);
        System.out.println(m01.getSalary());
        System.out.println(m01.getInt());
    }
}
