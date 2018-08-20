package com.designmode.a17_vistor;

public class Dog implements Animal {

	@Override
	public void eat() {
	}

	@Override
	public void study() {
	}

	@Override
	public void sleep() {
	}

	@Override
	public void vistor(IVistor vistor) {
		vistor.vistor(this);
	}
}
