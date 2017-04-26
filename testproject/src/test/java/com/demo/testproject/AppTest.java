package com.demo.testproject;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}
	
	public void masterchange()
	{
		System.out.println("Hi I am new update");
	}
	
	public void masterMethod2()
	{
		System.out.println("Hi I am new update");
	}

	public void BranchMethod()
	{
		System.out.println("Hi I am new update");
	}
}
