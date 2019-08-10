package com.example.jungleegames.designpattern.observer.pushpushsimple;

public class WindowDisplay implements IObserver{
	private IObservable observable;
	
	public WindowDisplay(IObservable observable) {
		this.observable = observable;
		this.observable.registerObserver(this);
	}
	
	@Override
	public void update(int temperature, int pressure) {
		System.out.println("Window Display temperature "+temperature+" and pressure "+pressure);
	}

}
