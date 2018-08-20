package com.designmode.create.t03_factory.t3_abstractfactory;

public class BlackPersonMan implements Person{
	@Override
	public void eat() {
		System.out.println("BlackPersonMan eat");
	}
	@Override
	public void sleep() {
		System.out.println("BlackPersonMan sleep");
	}
}
