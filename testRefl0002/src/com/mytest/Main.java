package com.mytest;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // SomeClass some = new SomeClass();
        Class someType = SomeClass.class;
        Arrays.stream(someType.getFields())
                .filter(field -> field.getName() == "impl01")
                .forEach(action -> {
            SomeClass someClass  = new SomeClass();
                    try {
                        action.set(someClass, new SomeImpl01());
                        System.out.println(action.get(someClass).getClass().getName());
                        ((SomeImpl01)action.get(someClass)).run();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });
    }
}
