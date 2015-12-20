package com.mytest;

/**
 * Created by Alexander on 12/1/2015.
 */
public class OnlyStatic {
    static int _intValue;
    static String _stringValue;
    static {
        _intValue = 7;
        _stringValue = "test static string";
    }
}
