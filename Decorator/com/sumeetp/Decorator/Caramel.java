package com.sumeetp.Decorator;

public class Caramel implements Decorator {
	Beverage b;
	String descr;
	public Caramel(Beverage b) {
		System.out.println("Adding Caramel");
		descr="Caramel is a ......";
		this.b=b;
	}
	public int getCost() {
		return b.getCost()+15;
	}
}