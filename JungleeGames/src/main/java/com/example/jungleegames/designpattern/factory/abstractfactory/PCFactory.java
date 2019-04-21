package com.example.jungleegames.designpattern.factory.abstractfactory;

import com.example.jungleegames.designpattern.factory.bean.Computer;
import com.example.jungleegames.designpattern.factory.bean.PC;

public class PCFactory implements ComputerAbstractFactory {
	private String ram;
	private String hdd;
	private String CPU;

	@Override
	public Computer createComputer() {
		return new PC(this.ram, this.hdd, this.CPU);
	}
	
	public PCFactory(String ram, String hdd, String CPU) {
		this.ram = ram;
		this.hdd = hdd;
		this.CPU = CPU;
	}

}
