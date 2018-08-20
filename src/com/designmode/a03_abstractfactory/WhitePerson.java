package com.designmode.a03_abstractfactory;

public class WhitePerson implements IPerson{

	@Override
	public void eat() {
		System.out.println("WhitePerson eat");
	}

	@Override
	public void study() {
		System.out.println("WhitePerson study");
	}

	@Override
	public void sleep() {
		System.out.println("WhitePerson sleep");
	}

}
