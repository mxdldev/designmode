package com.designmode.action.t05_vistior;

public class Dog implements Animal {
	@Override
	public void eat() {
		System.out.println("dog eat");
	}

	@Override
	public void sleep() {
		System.out.println("dog sleep");
	}

	@Override
	public void vistor(Vistor vistor) {
		vistor.vistor(this);
	}
}
