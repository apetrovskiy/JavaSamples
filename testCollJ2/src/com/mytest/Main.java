package com.mytest;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayListDemo demo01 = new ArrayListDemo();
        demo01.Test();
        System.out.println("==========================================================");
        ArrayListToArray demo02 = new ArrayListToArray();
        demo02.Test();
        System.out.println("==========================================================");
        LinkedListDemo demo03 = new LinkedListDemo();
        demo03.Test();
        System.out.println("==========================================================");
        HashSetDemo demo04 = new HashSetDemo();
        demo04.Test();
        System.out.println("==========================================================");
        TreeSetDemo demo05 = new TreeSetDemo();
        demo05.Test();
        System.out.println("==========================================================");
    }
}
