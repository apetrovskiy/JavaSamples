package com.mytest;

import java.util.ArrayList;

/**
 * Created by Alexander on 11/28/2015.
 */
public class ArrayListToArray {
    public void Test() {
        ArrayList al = new ArrayList();

        al.add(new Integer(1));
        al.add(new Integer(2));
        al.add(new Integer(3));
        al.add(new Integer(4));

        System.out.println("Contents of al is " + al);
        Object ia[] = al.toArray();
        int sum = 0;

        for (int i=0; i<ia.length; i++)
            sum += ((Integer)ia[i]).intValue();

        System.out.println("The sum is " + sum);
    }
}
