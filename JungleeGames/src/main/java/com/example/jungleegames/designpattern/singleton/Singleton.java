package com.example.jungleegames.designpattern.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
	
	private static final long serialVersionUID = 1L;
	/*
	 * Without volatile modifier, it’s possible for another thread in Java to see
	 * half initialized state of singleton instance variable, but with volatile variable
	 * guaranteeing happens-before relationship, all the write will happen on
	 * volatile singleton instance before any read of sSoleInstance variable.
	 */
	private static volatile Singleton singleton;
	
	public String x = "default";
	public int y = 0;
	
	/*
	 * use null check in constructor to avoid instantiation using reflection. You can
	 * make the new instance of the Singleton class by changing the constructor
	 * visibility as public in run-time and create new instance using that
	 * constructor
	 */
	private Singleton() {
		if (singleton != null) {
			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
		}
		System.setSecurityManager(new SecurityManager());
	}
	
	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) 
					singleton = new Singleton();
			}
		}
		return singleton;
	}
	
	//Make singleton from serialize and deserialize operation.
	protected Object readResolve() {
		return getInstance();
	} 
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//throw new CloneNotSupportedException("Clone of Singleton class is not supported");
		return getInstance();
	}
}
