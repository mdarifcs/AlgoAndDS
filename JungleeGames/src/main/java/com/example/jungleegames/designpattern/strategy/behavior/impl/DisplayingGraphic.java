package com.example.jungleegames.designpattern.strategy.behavior.impl;

import com.example.jungleegames.designpattern.strategy.behavior.IDisplayBehavior;

public class DisplayingGraphic implements IDisplayBehavior {

	@Override
	public void display() {
		System.out.println("Graphic displaying");
	}

}
