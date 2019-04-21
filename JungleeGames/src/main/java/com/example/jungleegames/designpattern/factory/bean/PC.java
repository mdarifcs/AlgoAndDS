package com.example.jungleegames.designpattern.factory.bean;

public class PC implements Computer {
	private String ram;
	private String hdd;
	private String CPU;

	public PC(String ram, String hdd, String CPU) {
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
		return "PC [ram=" + ram + ", hdd=" + hdd + ", CPU=" + CPU + "]";
	}
}
