package com.mytest;

/**
 * Created by shuran on 12/1/2015.
 */
public class WithFields {
    int _intValue;
    String _stringValue;
    public WithFields(String... args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}
