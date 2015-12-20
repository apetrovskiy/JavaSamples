package com.mytest;

import java.util.LinkedList;

/**
 * Created by Alexander on 11/28/2015.
 */
public class LinkedListDemo {
    public void Test() {
        LinkedList ll = new LinkedList();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");

        System.out.println("The initial content is " + ll);

        ll.remove("F");
        ll.remove(2);

        System.out.println("Contents of ll is " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("after removal of the first and the last" + ll);

        Object val = ll.get(2);
        ll.set(2, (String)val + " has changed");

        System.out.println("after changes " + ll);
    }
}
