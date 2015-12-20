package com.mytest;

import java.util.TreeSet;

/**
 * Created by Alexander on 11/30/2015.
 */
public class TreeSetDemo {
    public void Test() {
        TreeSet ts = new TreeSet();

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);
    }
}
