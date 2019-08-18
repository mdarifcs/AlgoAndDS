package com.example.jungleegames.designpattern.factory;

import com.example.jungleegames.designpattern.factory.abstractfactory.ComputerAbstractFactory;
import com.example.jungleegames.designpattern.factory.abstractfactory.ComputerFactory;
import com.example.jungleegames.designpattern.factory.abstractfactory.LaptopFactory;
import com.example.jungleegames.designpattern.factory.abstractfactory.PCFactory;
import com.example.jungleegames.designpattern.factory.abstractfactory.ServerFactory;
import com.example.jungleegames.designpattern.factory.bean.Computer;

public class ComputerClient {
	public static void main(String[] args) {
		//factory method
		/*Computer pc = ComputerFactory.createComputer(ComputerType.PC, "512 mb", "1 tb", "1.8 ghz");
		System.out.println(pc);
		Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "32 gb", "4 tb", "3.4 ghz");
		System.out.println(server);*/
		
		//abstract factory
		ComputerAbstractFactory caf = new PCFactory("512 mb", "1 tb", "1.8 ghz");
		Computer pc = ComputerFactory.createComputer(caf);
		System.out.println(pc);
		Computer server = ComputerFactory.createComputer(new ServerFactory("32 gb", "4 tb", "3.4 ghz"));
		System.out.println(server);
		Computer laptop = ComputerFactory.createComputer(new LaptopFactory("256 mb", "512 gb", "1.6 ghz"));
		System.out.println(laptop);
		
	}
}
