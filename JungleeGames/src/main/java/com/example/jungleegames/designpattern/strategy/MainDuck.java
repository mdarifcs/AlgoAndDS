package com.example.jungleegames.designpattern.strategy;

import com.example.jungleegames.designpattern.strategy.behavior.impl.DisplayingGraphic;
import com.example.jungleegames.designpattern.strategy.behavior.impl.FlyingJet;
import com.example.jungleegames.designpattern.strategy.behavior.impl.FlyingNormal;
import com.example.jungleegames.designpattern.strategy.client.impl.CloudDuck;
import com.example.jungleegames.designpattern.strategy.client.impl.MallardDuck;
import com.example.jungleegames.designpattern.strategy.client.impl.RubberDuck;
import com.example.jungleegames.designpattern.strategy.client.impl.WhiteDuck;

public class MainDuck {

	public static void main(String[] args) {
		System.out.println("CloudDuck");
		CloudDuck cd = new CloudDuck();
		cd.performDisplay();
		cd.performFly();
		cd.performquack();
		
		System.out.println("\n\nMallardDuck");
		MallardDuck md = new MallardDuck();
		md.performDisplay();
		md.performFly();
		md.performquack();
		
		System.out.println("\n\nRubberDuck");
		RubberDuck rb = new RubberDuck();
		rb.performFly();
		rb.performquack();
		rb.performDisplay();
		
		System.out.println("\n\ngoing to change display behavior of mallard duck");
		md.setDisplayBehavior(new DisplayingGraphic());
		md.performDisplay();
		
		WhiteDuck wb = new WhiteDuck();
		wb.performEat();
		wb.setFlyBehavior(new FlyingJet());
		wb.performFly();
		wb.setFlyBehavior(new FlyingNormal());
		wb.performFly();
	}

}
