package com.designmode.create.t03_factory.t3_abstractfactory;

public class WhitePersonMan implements Person{
	@Override
	public void eat() {
		System.out.println("WhitePersonMan eat");
	}
	@Override
	public void sleep() {
		System.out.println("WhitePersonMan sleep");
	}
}
