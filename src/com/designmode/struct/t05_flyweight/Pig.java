package com.designmode.struct.t05_flyweight;

public class Pig implements Animal {
	@Override
	public void eat() {
		System.out.println("Pig eat");
	}

	@Override
	public void sleep() {
		System.out.println("Pig sleep");
	}

	@Override
	public void work() {
		System.out.println("Pig work");
	}
}
