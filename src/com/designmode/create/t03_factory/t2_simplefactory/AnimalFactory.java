package com.designmode.create.t03_factory.t2_simplefactory;

public class AnimalFactory {
	public static Animal createAnimal(Class clazz){
		try {
			return (Animal) clazz.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
