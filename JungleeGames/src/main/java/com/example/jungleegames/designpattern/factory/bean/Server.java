package com.example.jungleegames.designpattern.factory.bean;

public class Server implements Computer {
	private String ram;
	private String hdd;
	private String CPU;

	public Server(String ram, String hdd, String CPU) {
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
		return "Server [ram=" + ram + ", hdd=" + hdd + ", CPU=" + CPU + "]";
	}
}
