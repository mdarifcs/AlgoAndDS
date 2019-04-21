package com.example.jungleegames.designpattern.factory.abstractfactory;

import com.example.jungleegames.designpattern.factory.bean.Computer;
import com.example.jungleegames.designpattern.factory.bean.Server;

public class ServerFactory implements ComputerAbstractFactory {
	private String ram;
	private String hdd;
	private String CPU;
	
	@Override
	public Computer createComputer() {
		return new Server(this.ram, this.hdd, this.CPU);
	}

	public ServerFactory(String ram, String hdd, String CPU) {
		this.ram = ram;
		this.hdd = hdd;
		this.CPU = CPU;
	}
}
