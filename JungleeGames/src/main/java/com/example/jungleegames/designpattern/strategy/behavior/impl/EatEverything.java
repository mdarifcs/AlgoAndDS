package com.example.jungleegames.designpattern.strategy.behavior.impl;

import com.example.jungleegames.designpattern.strategy.behavior.IEatBehavior;

public class EatEverything implements IEatBehavior {

	@Override
	public void eat() {
		System.out.println("Eating everything");

	}

}
