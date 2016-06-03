package com.epam.test;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<SomeClass> list = new ArrayList<SomeClass>();
        list.add(new SomeClass(true));
        list.add(new SomeClass(false));
        list.stream().anyMatch(item -> item.getBoolField());
        list.stream().findFirst();
        System.out.println(list.stream().filter(item -> item.getBoolField()).count());
        System.out.println(list.stream().filter(item -> !item.getBoolField()).count());
    }
}
