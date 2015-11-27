package com.mytest;

import java.util.ArrayList;

/**
 * Created by alexa_000 on 26/11/2015.
 */
public class ClassWithAnonymous {
    public void Run() {
        new ArrayList<String>() {{ add("test01"); add("test02"); }};
    }
}
