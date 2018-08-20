package com.designmode.a16_observer;

public class Test {
	public static void main(String[] args) {
		Person person = new Person();
		Animal animal = new Animal();
		HousePrice housePrice = new HousePrice();
		housePrice.addObserver(person);
		housePrice.addObserver(animal);
		housePrice.changePrice(123.12f);
	}
}
