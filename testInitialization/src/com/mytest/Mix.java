package com.mytest;

/**
 * Created by Alexander on 12/1/2015.
 */
public class Mix {
    int _intValue;
    static String _stringValue;
    static String _oneMoreStringValue;
    {
        _intValue = 9;
        _stringValue = "test static string in a mix class";
    }
    static {
        _oneMoreStringValue = "one more test static string";
    }
}
