package com.mytest;

/**
 * Created by shuran on 12/6/2015.
 */
public class Manager extends Employee {

    public Manager(int _salary) {
        super(_salary);
    }

    public int getSalary() {
        return super.getSalary() + 5;
    }

    public int getInt() {
        return super.getInt() + 5;
    }
}
