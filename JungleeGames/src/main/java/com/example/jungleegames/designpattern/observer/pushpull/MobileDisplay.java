package com.example.jungleegames.designpattern.observer.pushpull;

public class MobileDisplay implements IObserver {
	private IObservable observable;
	
	public MobileDisplay(IObservable observable) {
		this.observable = observable;
		this.observable.registerObserver(this);
	}
	
	@Override
	public void update() {
		if (this.observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) this.observable;
			System.out.println("This is mobile display and temprature "+weatherData.getTemperature()+" and pressure "+weatherData.getPressure());
		}
	}
}
