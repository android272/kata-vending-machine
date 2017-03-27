package com.MindForgeStudios.kata_vending_machine;

public enum Coin {
	PENNY(19, 2.5),
	NICKEL(21.2, 5),
	DIME(17.9, 2.2),
	QUARTER(24.3, 5.6);
	
	private final double diameter;
	private final double weight;
	
	Coin(double diameter, double weight) {
		this.diameter = diameter;
		this.weight = weight;
	}

	public double getDiameter() {
		return diameter;
	}

	public double getWeight() {
		return weight;
	}
}
