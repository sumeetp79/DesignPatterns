package com.sumeetp.Decorator;

public class Milk implements Beverage {
	public Milk() {
		System.out.println("Adding Milk");
	}
	public int getCost() {
		return 23;
	}
}
		