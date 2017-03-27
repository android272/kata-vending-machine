package com.MindForgeStudios.kata_vending_machine;

import junit.framework.TestCase;

public class AcceptCoinsTest extends TestCase {
	public void testNull() {
        assertEquals(false, AcceptCoins.determineValue(null));
    }
	
	public void testFalseValues() {
		assertEquals(0, AcceptCoins.determineValue(Coin.PENNY));
		assertEquals(42, AcceptCoins.determineValue(Coin.NICKEL));
		assertEquals(31, AcceptCoins.determineValue(Coin.DIME));
		assertEquals(89, AcceptCoins.determineValue(Coin.QUARTER));
	}
	
	public void testAcurateValues() {
		assertEquals(1, AcceptCoins.determineValue(Coin.PENNY));
		assertEquals(5, AcceptCoins.determineValue(Coin.NICKEL));
		assertEquals(10, AcceptCoins.determineValue(Coin.DIME));
		assertEquals(25, AcceptCoins.determineValue(Coin.QUARTER));		
	}
}