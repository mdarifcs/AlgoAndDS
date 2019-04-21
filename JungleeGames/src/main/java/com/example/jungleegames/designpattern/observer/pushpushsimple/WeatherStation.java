package com.example.jungleegames.designpattern.observer.pushpushsimple;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		MobileDisplay mobileDisplay = new MobileDisplay(weatherData);
		WindowDisplay windowDisplay = new WindowDisplay(weatherData);
		
		weatherData.setMeasurement(10, 20);
		System.out.println();
		weatherData.setMeasurement(100, 200);
		
		weatherData.removeObserver(windowDisplay);
		
		System.out.println();
		weatherData.setMeasurement(1000, 2000);
	}
}
