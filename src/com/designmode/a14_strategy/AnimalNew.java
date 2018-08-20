package com.designmode.a14_strategy;

public class AnimalNew{
	private Animal animal;
	public AnimalNew(Animal animal){
		this.animal = animal;
	}
	public void eat() {
		animal.eat();
	}
	public void study() {
		animal.study();
	}
	public void sleep() {
		animal.sleep();
	}
	
}
