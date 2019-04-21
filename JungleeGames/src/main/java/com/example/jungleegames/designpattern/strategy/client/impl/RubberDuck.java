package com.example.jungleegames.designpattern.strategy.client.impl;

import com.example.jungleegames.designpattern.strategy.behavior.impl.DisplayingText;
import com.example.jungleegames.designpattern.strategy.behavior.impl.FlyingNot;
import com.example.jungleegames.designpattern.strategy.behavior.impl.QuackingNot;
import com.example.jungleegames.designpattern.strategy.client.Duck;

public class RubberDuck extends Duck {
	public RubberDuck(){
		fb = new FlyingNot();
		qb = new QuackingNot();
		db = new DisplayingText();
	}
	
}
