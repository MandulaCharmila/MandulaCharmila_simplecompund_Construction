package com.simplecompound.simplecompound_interest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SimpleCompound {

	@Test
	public void test() {
		SimpleAndCompound sc = new SimpleAndCompound();
		
		// Calculate Simple Interest
		double answer = sc.simpleInterest(500, 20, 5);
		assertEquals(500.0, answer,0.001);
		
		
		// Calculate Compound Interest
		answer = sc.compoundInterest(500, 10, 2);
		assertEquals(105.000,answer,0.001);
	}
}