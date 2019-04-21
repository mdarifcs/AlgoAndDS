package com.example.jungleegames.designpattern.strategy.behavior.impl;

import com.example.jungleegames.designpattern.strategy.behavior.IFlyBehavior;

public class FlyingNot implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Not flying");

	}

}
