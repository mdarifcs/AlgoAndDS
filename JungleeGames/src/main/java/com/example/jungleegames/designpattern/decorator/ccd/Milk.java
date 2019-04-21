package com.example.jungleegames.designpattern.decorator.ccd;

public class Milk extends Addon{
	Beverage beverage;
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription()+" add milk";
	}
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public int cost() {
		return beverage.cost() + 5;
	}

}
