package com.designmode.create.t03_factory.t3_abstractfactory;

public class YellowPersonWoman implements Person{
	@Override
	public void eat() {
		System.out.println("YellowPersonWoman eat");
	}
	@Override
	public void sleep() {
		System.out.println("YellowPersonWoman sleep");
	}
}
