package com.designmode.a03_abstractfactory;

public class YellowPersonMan extends YellowPerson {
	@Override
	public void eat() {
		System.out.println("YellowPersonMan eat");
	}
	@Override
	public void study() {
		System.out.println("YellowPersonMan study");
	}
	@Override
	public void sleep() {
		System.out.println("YellowPersonMan sleep");
	}
}
