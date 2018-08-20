package com.designmode.a03_abstractfactory;

public class YellowPerson implements IPerson{

	@Override
	public void eat() {
		System.out.println("YellowPerson eat");
	}

	@Override
	public void study() {
		System.out.println("YellowPerson study");
	}

	@Override
	public void sleep() {
		System.out.println("YellowPerson sleep");
	}

}
