package com.jmethods.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		int result = Calculator.add(3, 4);
		assertEquals(7, result);
	}

}
