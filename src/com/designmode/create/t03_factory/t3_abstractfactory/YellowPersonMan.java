package com.designmode.create.t03_factory.t3_abstractfactory;

public class YellowPersonMan implements Person{
	@Override
	public void eat() {
		System.out.println("YellowPersonMan eat");
	}
	@Override
	public void sleep() {
		System.out.println("YellowPersonMan sleep");
	}
}
