package com.mytest;

import java.util.HashSet;

/**
 * Created by Alexander on 11/29/2015.
 */
public class HashSetDemo {
    public void Test() {
        HashSet hs = new HashSet();
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");

        System.out.println(hs);
    }
}
