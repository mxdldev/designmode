package com.designmode.create.t03_factory.t2_simplefactory;

public class Dog implements Animal {
	@Override
	public void eat() {
		System.out.println("dog eat");
	}

	@Override
	public void sleep() {
		System.out.println("dog sleep");
	}
}
