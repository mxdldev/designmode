package com.designmode.create.t03_factory.t2_simplefactory;

public class Cat implements Animal {
	@Override
	public void eat() {
		System.out.println("cat eat");
	}

	@Override
	public void sleep() {
		System.out.println("cat sleep");
	}
}
