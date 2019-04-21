package com.example.jungleegames.designpattern.observer.pushpull;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements IObservable {
	private List<IObserver> observers = new ArrayList<>();
	private int temperature;
	private int pressure;
	
	public void setMeasurement(int temperature, int pressure) {
		this.temperature = temperature;
		this.pressure = pressure;
		measuremenetChanged();
	}
	
	private void measuremenetChanged() {
		notifyObservers();
	}

	@Override
	public void registerObserver(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		int index = observers.indexOf(observer);
		if (index>=0) 
			observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (IObserver observer : observers) 
			observer.update();
	}

	public int getTemperature() {
		return temperature;
	}

	public int getPressure() {
		return pressure;
	}

}
