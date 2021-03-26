package com.lti.testcode;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.junit.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {

		Calculator c = new Calculator();
		int actualresult = c.add(10, 20);
		int expectedresult = 30;
		assertEquals(expectedresult, actualresult);
		
	}
	
	@Test
	public void testSub() {

		Calculator c = new Calculator();
		int actualresult = c.sub(20, 10);
		int expectedresult = 10;
		assertEquals(expectedresult, actualresult);
	}

}
