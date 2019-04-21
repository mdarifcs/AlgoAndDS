package com.example.jungleegames.designpattern.strategy.behavior.impl;

import com.example.jungleegames.designpattern.strategy.behavior.IQuackBehavior;

public class QuackingNormal implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("Normal quack");
		
	}

}
