package com.designmode.a17_vistor;

public class Test {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Pig pig = new Pig();
		Vistor vistor = new Vistor();
		
		cat.vistor(vistor);
		dog.vistor(vistor);
		pig.vistor(vistor);
	}
}
