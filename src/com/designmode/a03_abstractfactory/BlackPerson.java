package com.designmode.a03_abstractfactory;

public class BlackPerson implements IPerson{

	@Override
	public void eat() {
		System.out.println("BlackPerson eat");
	}

	@Override
	public void study() {
		System.out.println("BlackPerson study");
	}

	@Override
	public void sleep() {
		System.out.println("BlackPerson sleep");
	}

}
