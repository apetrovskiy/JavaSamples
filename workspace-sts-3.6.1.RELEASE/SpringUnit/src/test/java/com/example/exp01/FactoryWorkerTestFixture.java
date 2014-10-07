package com.example.exp01;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class FactoryWorkerTestFixture {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test001() {
		Worker worker = new FactoryWorker();
		worker.setId("3");
		worker.setName("aaa");
		assertEquals(null, "3 aaa", worker.getReport());
	}
	
	@Test
	public void test002() {
		Worker worker = new FactoryWorker();
		worker.setId("3");
		worker.setName("aaa");
		assertEquals(null, "3 bbb", worker.getReport());
	}
}
