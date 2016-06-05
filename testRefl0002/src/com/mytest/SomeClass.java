package com.mytest;

/**
 * Created by shuran on 6/5/2016.
 */
public class SomeClass {
    public String StringData;
    public boolean BooleanData;
    public SomeImpl01 impl01;
    public SomeImpl02 impl02;

    public SomeClass() {
        impl01 = new SomeImpl01();
        impl02 = new SomeImpl02();
    }
}
