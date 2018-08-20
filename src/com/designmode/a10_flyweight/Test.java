package com.designmode.a10_flyweight;

public class Test {
	public static void main(String[] args) {
		Animal animal = AnimalFactory.hashMap.get(AnimalEnum.PIG);
		animal.eat();
	}
}
