package com.example.jungleegames.designpattern.strategy.behavior.impl;

import com.example.jungleegames.designpattern.strategy.behavior.IDisplayBehavior;

public class DisplayingText implements IDisplayBehavior {

	@Override
	public void display() {
		System.out.println("Text displaying");
		
	}

}
