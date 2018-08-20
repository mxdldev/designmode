package com.designmode.create.t03_factory.t2_simplefactory;

public class Pig implements Animal {
	@Override
	public void eat() {
		System.out.println("pig eat");
	}

	@Override
	public void sleep() {
		System.out.println("pig sleep");
	}
}
