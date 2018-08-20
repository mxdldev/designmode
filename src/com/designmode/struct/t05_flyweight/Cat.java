package com.designmode.struct.t05_flyweight;

public class Cat implements Animal {
	@Override
	public void eat() {
		System.out.println("cat eat");
	}

	@Override
	public void sleep() {
		System.out.println("cat sleep");
	}

	@Override
	public void work() {
		System.out.println("cat work");
	}
}
