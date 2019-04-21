package com.example.jungleegames.designpattern.factory.factorymethod;

import com.example.jungleegames.designpattern.factory.bean.Computer;
import com.example.jungleegames.designpattern.factory.bean.PC;
import com.example.jungleegames.designpattern.factory.bean.Server;

public class ComputerFactory {
	public static Computer createComputer(ComputerType type, String ram, String hdd, String CPU) {
		Computer computer = null;
		switch (type) {
		case PC:
			computer = new PC(ram, hdd, CPU);
			break;
		case SERVER:
			computer = new Server(ram, hdd, CPU);
			break;
		}
		return computer;
	}
}
