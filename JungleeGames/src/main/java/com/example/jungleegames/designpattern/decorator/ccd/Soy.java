package com.example.jungleegames.designpattern.decorator.ccd;

public class Soy extends Addon{
	Beverage beverage;
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription()+" add soy";
	}
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public int cost() {
		return this.beverage.cost()+3;
	}

}
