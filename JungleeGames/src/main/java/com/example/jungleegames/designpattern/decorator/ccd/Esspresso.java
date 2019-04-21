package com.example.jungleegames.designpattern.decorator.ccd;

public class Esspresso extends Beverage{

	public Esspresso() {
		description = "Esspresso";
	}
	
	@Override
	public int cost() {
		return 25;
	}

}
