package com.example.jungleegames.designpattern.observer.pushpull;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		IObserver mobile = new MobileDisplay(weatherData);
		IObserver window = new WindowDisplay(weatherData);
		
		weatherData.setMeasurement(10, 20);
		System.out.println();
		weatherData.setMeasurement(100, 200);
	}

}
