package com.designmode.struct.t05_flyweight;

public class Dog implements Animal {
	@Override
	public void eat() {
		System.out.println("Dog eat");
	}

	@Override
	public void sleep() {
		System.out.println("Dog sleep");
	}

	@Override
	public void work() {
		System.out.println("Dog work");
	}
}
