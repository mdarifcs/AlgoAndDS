package com.example.jungleegames.designpattern.decorator.ccd;

public abstract class Beverage {
	public String description = "Unknown beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract int cost();
}
