package com.test.mytest;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) throws Exception { // throws IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, NoSuchMethodException {
	// write your code here

        // Class<?> someClass = Class.forName(args[0]);
        Class<?> someClass = Class.forName("com.test.mytest.FancyStringCreator");
        Class<? extends StringCreator> creatorClass = someClass.asSubclass(StringCreator.class);
        Constructor<? extends StringCreator> creatorCtor = creatorClass.getConstructor((Class<?>[]) null);
        Creator<String> creator = creatorCtor.newInstance((Object[]) null);

    }
}
