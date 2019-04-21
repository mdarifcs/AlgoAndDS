package com.example.jungleegames.designpattern.strategy.client.impl;

import com.example.jungleegames.designpattern.strategy.behavior.impl.DisplayingText;
import com.example.jungleegames.designpattern.strategy.behavior.impl.FlyingNormal;
import com.example.jungleegames.designpattern.strategy.behavior.impl.QuackingNormal;
import com.example.jungleegames.designpattern.strategy.client.Duck;

public class MallardDuck extends Duck{

	public MallardDuck() {
		fb = new FlyingNormal();
		qb = new QuackingNormal();
		db = new DisplayingText();
	}
	
}
