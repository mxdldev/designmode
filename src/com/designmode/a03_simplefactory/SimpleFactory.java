package com.designmode.a03_simplefactory;

public class SimpleFactory {
	public static Animal createAnimal(Class clazz){
		try {
			return (Animal) clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
