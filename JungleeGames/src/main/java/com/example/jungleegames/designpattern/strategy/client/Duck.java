package com.example.jungleegames.designpattern.strategy.client;

import com.example.jungleegames.designpattern.strategy.behavior.IDisplayBehavior;
import com.example.jungleegames.designpattern.strategy.behavior.IEatBehavior;
import com.example.jungleegames.designpattern.strategy.behavior.IFlyBehavior;
import com.example.jungleegames.designpattern.strategy.behavior.IQuackBehavior;

public abstract class Duck {
	public IFlyBehavior fb;
	public IQuackBehavior qb;
	public IDisplayBehavior db;
	public IEatBehavior eb;
	
	public void performEat() {
		eb.eat();
	}
	
	public void performFly() {
		fb.fly();
	}
	
	public void performquack() {
		qb.quack();
	}
	
	public void performDisplay() {
		db.display();
	}
	
	public void setFlyBehavior(IFlyBehavior fb) {
		this.fb = fb;
	}
	
	public void setQuackBehavior(IQuackBehavior qb) {
		this.qb = qb;
	}
	
	public void setDisplayBehavior(IDisplayBehavior db) {
		this.db = db;
	}
	
	public void setEatBehavior(IEatBehavior eb) {
		this.eb = eb;
	}
	
}
