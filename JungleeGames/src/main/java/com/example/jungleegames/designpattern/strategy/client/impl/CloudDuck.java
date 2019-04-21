package com.example.jungleegames.designpattern.strategy.client.impl;

import com.example.jungleegames.designpattern.strategy.behavior.impl.DisplayingText;
import com.example.jungleegames.designpattern.strategy.behavior.impl.FlyingJet;
import com.example.jungleegames.designpattern.strategy.behavior.impl.QuackingNormal;
import com.example.jungleegames.designpattern.strategy.client.Duck;

public class CloudDuck extends Duck{
	public CloudDuck(){
		fb = new FlyingJet();
		qb = new QuackingNormal();
		db = new DisplayingText();
	}
}
