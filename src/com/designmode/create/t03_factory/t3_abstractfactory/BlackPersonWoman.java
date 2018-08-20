package com.designmode.create.t03_factory.t3_abstractfactory;

public class BlackPersonWoman implements Person{
	@Override
	public void eat() {
		System.out.println("BlackPersonWoman eat");
	}
	@Override
	public void sleep() {
		System.out.println("BlackPersonWoman sleep");
	}
}
