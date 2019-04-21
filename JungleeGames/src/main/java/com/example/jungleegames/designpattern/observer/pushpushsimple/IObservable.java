package com.example.jungleegames.designpattern.observer.pushpushsimple;

public interface IObservable {
	public void registerObserver(IObserver observer);
	public void removeObserver(IObserver observer);
	public void notifyObserver(); 
}
