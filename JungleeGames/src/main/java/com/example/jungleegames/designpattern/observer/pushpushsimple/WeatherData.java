package com.example.jungleegames.designpattern.observer.pushpushsimple;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements IObservable{
	List<IObserver> observers = new ArrayList<>();
	private int temperature;
	private int pressure;
	
	public void setMeasurement(int temprature, int pressure) {
		this.temperature = temprature;
		this.pressure = pressure;
		measurementChanged();
	}

	private void measurementChanged() {
		notifyObserver();
	}

	@Override
	public void registerObserver(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		int observerIndex = observers.indexOf(observer);
		if(observerIndex>=0)
			observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		for (IObserver observer : observers) {
			observer.update(temperature, pressure);
		}
		
	}

}
