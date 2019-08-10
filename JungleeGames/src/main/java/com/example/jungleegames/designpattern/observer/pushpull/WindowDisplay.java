package com.example.jungleegames.designpattern.observer.pushpull;

public class WindowDisplay implements IObserver {
	private IObservable observable;
	
	public WindowDisplay(IObservable observable) {
		this.observable = observable;
		observable.registerObserver(this);
	}
	
	@Override
	public void update() {
		if (this.observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			System.out.println("This is window display and temprature "+weatherData.getTemperature()+" and pressure "+weatherData.getPressure());
		}
	}
}
