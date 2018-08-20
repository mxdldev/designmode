package com.designmode.a03_abstractfactory;

public class YellowPersonWoman extends YellowPerson {
	@Override
	public void eat() {
		System.out.println("YellowPersonWoman eat");
	}
	@Override
	public void study() {
		System.out.println("YellowPersonWoman study");
	}
	@Override
	public void sleep() {
		System.out.println("YellowPersonWoman sleep");
	}
}
