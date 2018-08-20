package com.designmode.a14_strategy;

public class Test {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Pig pig = new Pig();
		AnimalNew animalNew1 = new AnimalNew(cat);
		AnimalNew animalNew2 = new AnimalNew(dog);
		AnimalNew animalNew3 = new AnimalNew(pig);
		
		animalNew1.eat();
	}
}
