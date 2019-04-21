package com.example.jungleegames.designpattern.strategy.client.impl;

import com.example.jungleegames.designpattern.strategy.behavior.impl.EatEverything;
import com.example.jungleegames.designpattern.strategy.client.Duck;

public class WhiteDuck extends Duck{
		
	public WhiteDuck() {
		eb = new EatEverything();
	}
}
