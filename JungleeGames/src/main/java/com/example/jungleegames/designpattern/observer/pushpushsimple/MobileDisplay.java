package com.example.jungleegames.designpattern.observer.pushpushsimple;

public class MobileDisplay implements IObserver{
	IObservable observable;
	
	public MobileDisplay(IObservable observable) {
		this.observable = observable;
		this.observable.registerObserver(this);
	}
	
	@Override
	public void update(int temperature, int pressure) {
		System.out.println("Mobile Display temperature "+temperature+" and pressure "+pressure);
	}

}
