package com.apress.prospring3.ch4.xml;

import com.apress.prospring3.ch4.Oracle;

public class InjectRef {
	private Oracle oracle;
	public void setOracle(Oracle oracle) {
		this.oracle = oracle;
	}
	
	public String toString() {
		return oracle.defineMeaningOfLife();
	}
}
