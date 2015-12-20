/**
 * Created by Alexander on 11/28/2015.
 */
package com.mytest;

import java.util.ArrayList;

public class ArrayListDemo {
    public void Test() {
        ArrayList al = new ArrayList();
        System.out.println("Initial size is " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("The size is " + al.size());
        System.out.println("Contents of al is " + al);

        al.remove("F");
        al.remove(2);
        System.out.println("The size is " + al.size());
        System.out.println("Contents of al is " + al);
    }
}
