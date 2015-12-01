package com.mytest;

/**
 * Created by shuran on 12/1/2015.
 */
public class WithoutFields {
    public WithoutFields(String... args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}
