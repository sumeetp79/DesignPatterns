package com.sumeetp.Decorator;

public class HotWater implements Beverage {
	public HotWater() {
		System.out.println("Adding Hotwater");
	}
	public int getCost() {
		return 10;
	}
}
		