package com.example.jungleegames.designpattern.strategy.behavior.impl;

import com.example.jungleegames.designpattern.strategy.behavior.IFlyBehavior;

public class FlyingNormal implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Normal flying");
		
	}

}
