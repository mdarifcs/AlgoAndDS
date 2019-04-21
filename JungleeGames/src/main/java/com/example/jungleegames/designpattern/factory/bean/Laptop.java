package com.example.jungleegames.designpattern.factory.bean;

public class Laptop implements Computer {
	private String ram;
	private String hdd;
	private String CPU;

	public Laptop(String ram, String hdd, String CPU) {
		this.ram = ram;
		this.hdd = hdd;
		this.CPU = CPU;
	}

	@Override
	public String getRam() {
		return ram;
	}

	@Override
	public String getHdd() {
		return hdd;
	}

	@Override
	public String getCPU() {
		return CPU;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", CPU=" + CPU + "]";
	}
}
