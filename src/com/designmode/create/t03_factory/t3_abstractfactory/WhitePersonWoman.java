package com.designmode.create.t03_factory.t3_abstractfactory;

public class WhitePersonWoman implements Person{
	@Override
	public void eat() {
		System.out.println("WhitePersonWoman eat");
	}
	@Override
	public void sleep() {
		System.out.println("WhitePersonWoman sleep");
	}
}
