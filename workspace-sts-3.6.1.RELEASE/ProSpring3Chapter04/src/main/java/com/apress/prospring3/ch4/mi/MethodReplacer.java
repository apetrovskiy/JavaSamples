package com.apress.prospring3.ch4.mi;

import java.lang.reflect.Method;

public interface MethodReplacer {
	public Object reimplement(Object arg0, Method method, Object[] args) throws Throwable;
}
