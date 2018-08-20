package com.designmode.action.t05_vistior;

public class Cat implements Animal{
	@Override
	public void eat() {
		System.out.println("cat eat");
	}

	@Override
	public void sleep() {
		System.out.println("cat sleep");
	}

	@Override
	public void vistor(Vistor vistor) {
		vistor.vistor(this);
	}
	
}
