package com.example.jungleegames.designpattern.observer.pushpull;

public class WindowDisplay implements IDisplay, IObserver {
	private IObservable observable;
	private int temperature = 0;
	private int pressure = 0;
	
	public WindowDisplay(IObservable observable) {
		this.observable = observable;
		observable.registerObserver(this);
	}
	
	@Override
	public void update() {
		if (this.observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			this.temperature = weatherData.getTemperature();
			this.pressure = weatherData.getPressure();
		}
		display();
	}

	@Override
	public void display() {
		System.out.println("This is window display and temprature "+temperature+" and pressure "+pressure);
	}

}
