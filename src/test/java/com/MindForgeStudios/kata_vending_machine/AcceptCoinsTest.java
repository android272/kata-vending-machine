package com.MindForgeStudios.kata_vending_machine;

import junit.framework.TestCase;

public class AcceptCoinsTest extends TestCase {
	public void testFalseValues() {
		assertEquals("error", AcceptCoins.determineValue(32, 14.2));
		assertEquals("error", AcceptCoins.determineValue(11.5, 7));
		assertEquals("error", AcceptCoins.determineValue(15.4, 5.1));
		assertEquals("error", AcceptCoins.determineValue(26.3, 6.3));
	}
	
	public void testAcurateValues() {
		assertEquals("return", AcceptCoins.determineValue(19, 2.5));
		assertEquals(5, AcceptCoins.determineValue(21.2, 5));
		assertEquals(10, AcceptCoins.determineValue(17.9, 2.2));
		assertEquals(25, AcceptCoins.determineValue(24.3, 5.6));		
	}
}