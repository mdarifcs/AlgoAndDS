package com.example.jungleegames.designpattern.factory.abstractfactory;

import com.example.jungleegames.designpattern.factory.bean.Computer;

public class ComputerFactory {
	public static Computer createComputer(ComputerAbstractFactory caf) {
		return caf.createComputer();
	}
}
