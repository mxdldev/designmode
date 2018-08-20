package com.designmode.a03_simplefactory;

public class Test {
	public static void main(String[] args) {
		Animal animal = SimpleFactory.createAnimal(Cat.class);
		 animal.eat();
		
	}
}
