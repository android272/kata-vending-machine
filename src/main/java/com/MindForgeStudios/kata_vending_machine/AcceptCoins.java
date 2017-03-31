package com.MindForgeStudios.kata_vending_machine;

public class AcceptCoins {
	public static Object determineValue(double diameter, double weight) {
		if(diameter == 19 && weight == 2.5) {
			return "return";
		} else if(diameter == 21.2 && weight == 5) {
			return 5;
		} else if(diameter == 17.9 && weight == 2.2) {
			return 10;
		} else if(diameter == 24.3 && weight == 5.6) {
			return 25;
		} else {
			return "error";
		}
	}
}