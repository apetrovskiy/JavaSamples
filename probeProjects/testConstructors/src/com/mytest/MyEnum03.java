package com.mytest;

/**
 * Created by alexa_000 on 25/11/2015.
 */
public enum MyEnum03 {
    ;
    public int One = 1;
    public int Two = 2;
    int Three = 3;
    protected int Four = 4;
    private int Five = 5;
    int six = 6;

    MyEnum03(int one, int two, int three, int four, int five, int six) {
        One = one;
        Two = two;
        Three = three;
        Four = four;
        Five = five;
        this.six = six;
    }
}
