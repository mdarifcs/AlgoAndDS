package com.example.test;

import java.util.HashSet;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) {
		Set<Employee> set = new HashSet<>();
		
		Employee e = new Employee();
		System.out.println(e);
		set.add(e);
		System.out.println(e.i+" size: "+set.size());
		
		e.i=5;
		System.out.println(e);
		set.add(e);
		System.out.println(e.i+" size: "+set.size());
		
		Employee e2 = new Employee();
		System.out.println(e2);
		set.add(e2);
		System.out.println(e2.i+" size: "+set.size());
	}
}


class Employee{
	int i;
	@Override
	public int hashCode() {
		return i;
	}
}