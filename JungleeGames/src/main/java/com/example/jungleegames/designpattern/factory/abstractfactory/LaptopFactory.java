package com.example.jungleegames.designpattern.factory.abstractfactory;

import com.example.jungleegames.designpattern.factory.bean.Computer;
import com.example.jungleegames.designpattern.factory.bean.Laptop;

public class LaptopFactory implements ComputerAbstractFactory {
	String ram;
	String hdd;
	String CPU;
	
	public LaptopFactory(String ram, String hdd, String CPU) {
		this.ram = ram;
		this.hdd = hdd;
		this.CPU = CPU;
	}

	@Override
	public Computer createComputer() {
		return new Laptop(ram, hdd, CPU);
	}

}
