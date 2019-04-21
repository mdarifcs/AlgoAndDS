package com.example.jungleegames.designpattern.decorator.ccd;

public class Decafe extends Beverage{

	public Decafe() {
		description = "Decafe";
	}
	
	@Override
	public int cost() {
		return 10;
	}

}
