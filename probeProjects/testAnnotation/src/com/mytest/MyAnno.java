package com.mytest;

import java.lang.annotation.Annotation;

/**
 * Created by alexa_000 on 30/11/2015.
 */
public @interface MyAnno {
    @Override
    default boolean equals(Object obj) {
        return false;
    }

    @Override
    default int hashCode() {
        return 0;
    }

    @Override
    default String toString() {
        return null;
    }

    @Override
    default Class<? extends Annotation> annotationType() {
        return null;
    }

    class Test01 {
        int _test01;
        String _test02;
        Test01(String stringData) {}

        public Test01(int _test01) {
            this._test01 = _test01;
        }
    }
}
