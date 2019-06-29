package com.example.jungleegames.designpattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingleton {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 breakSingletonByUsingRefelection();
		// breakSingletonByUsingSerialization();
		// singletonByUsingEnum();
		 // breakSingletonByCloning();
	}

	private static void breakSingletonByCloning() {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = null;
		try {
			instance2 = (Singleton) instance1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("instance1 " + instance1.hashCode());
		System.out.println("instance2 " + instance2.hashCode());
	}

	private static void singletonByUsingEnum() {
		SingletonEnum.SINGLE_INSTANCE.doSomething();
	}

	/*
	 * To prevent creation of another instance you have to provide the
	 * implementation of readResolve() method. readResolve() replaces the object
	 * read from the stream. This ensures that nobody can create another instance by
	 * serializing and deserializing the singleton.
	 */
	private static void breakSingletonByUsingSerialization() {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = null;

		try {
			// serialize
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("D:/serialization/serialize.txt"));
			out.writeObject(instance1);
			out.close();

			// deserialize
			ObjectInput in = new ObjectInputStream(new FileInputStream("D:/serialization/serialize.txt"));
			instance2 = (Singleton) in.readObject();
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("instance1 hascode " + instance1.hashCode());
		System.out.println("instance2 hascode " + instance2.hashCode());
	}

	private static void breakSingletonByUsingRefelection() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();
		Constructor theConstructor = constructors[0];
		theConstructor.setAccessible(true);
		Singleton instance1 = (Singleton) theConstructor.newInstance();
		Singleton instance2 = (Singleton) theConstructor.newInstance();
		System.out.println(instance1);
		System.out.println(instance2);
//		Singleton instance1 = Singleton.getInstance();
//
//		Singleton instance2 = null;
//
//		Class<Singleton> clazz = Singleton.class;
//		Constructor<Singleton> cons;
//		try {
//			cons = clazz.getDeclaredConstructor();
//			cons.setAccessible(true);
//			instance2 = cons.newInstance();
//		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
//				| IllegalArgumentException | InvocationTargetException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("instance1 hascode " + instance1.hashCode());
//		System.out.println("instance2 hascode " + instance2.hashCode());

	}
}
