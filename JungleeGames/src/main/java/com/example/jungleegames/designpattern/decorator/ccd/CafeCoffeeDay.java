package com.example.jungleegames.designpattern.decorator.ccd;

public class CafeCoffeeDay {

	public static void main(String[] args) {
		Beverage esspressoWithDoubleMilk = new Milk(new Milk(new Esspresso()));
		System.out.println("cost "+esspressoWithDoubleMilk.cost());
		System.out.println(esspressoWithDoubleMilk.getDescription());
		System.out.println();
		Beverage decafeWithMilkAndSoy = new Soy(new Milk(new Decafe()));
		System.out.println("cost "+decafeWithMilkAndSoy.cost());
		System.out.println(decafeWithMilkAndSoy.getDescription());
		

	}

}
