package com.designmode.a17_vistor;

public class Vistor implements IVistor {

	@Override
	public void vistor(Cat cat) {
		System.out.println("start process cat");
	}

	@Override
	public void vistor(Dog dog) {
		System.out.println("start process dog");
	}

	@Override
	public void vistor(Pig pig) {
		System.out.println("start process pig");
	}

}
