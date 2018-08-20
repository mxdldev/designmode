package com.designmode.action.t05_vistior;

public class Pig implements Animal {
	@Override
	public void eat() {
		System.out.println("pig eat");
	}

	@Override
	public void sleep() {
		System.out.println("pig sleep");
	}

	@Override
	public void vistor(Vistor vistor) {
		vistor.vistor(this);
	}
}
