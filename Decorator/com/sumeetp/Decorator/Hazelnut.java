package com.sumeetp.Decorator;

public class Hazelnut implements Decorator {
	Beverage b;
	public Hazelnut(Beverage b) {
		System.out.println("Adding Hazelnut");
		this.b=b;
	}
	public int getCost() {
		return b.getCost()+25;
	}
}