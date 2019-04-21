package com.example.jungleegames.designpattern.observer.pushpull;

public class MobileDisplay implements IObserver, IDisplay {
	private IObservable observable;
	private int temperature = 0;
	private int pressure = 0;
	
	public MobileDisplay(IObservable observable) {
		this.observable = observable;
		this.observable.registerObserver(this);
	}
	
	@Override
	public void update() {
		if (this.observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) this.observable;
			this.temperature = weatherData.getTemperature();
			this.pressure = weatherData.getPressure();
		}
		display();
	}
	
	@Override
	public void display() {
		System.out.println("This is mobile display and temprature "+temperature+" and pressure "+pressure);
	}

}
