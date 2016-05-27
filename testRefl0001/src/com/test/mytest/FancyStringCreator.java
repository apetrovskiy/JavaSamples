package com.test.mytest;

public class FancyStringCreator implements StringCreator  {
    public String create() { return new StringBuffer().toString(); }
}
