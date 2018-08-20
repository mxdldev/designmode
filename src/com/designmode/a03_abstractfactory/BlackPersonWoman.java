package com.designmode.a03_abstractfactory;

public class BlackPersonWoman extends BlackPerson {
	@Override
	public void eat() {
		System.out.println("BlackPersonWoman eat");
	}
	@Override
	public void study() {
		System.out.println("BlackPersonWoman study");
	}
	@Override
	public void sleep() {
		System.out.println("BlackPersonWoman sleep");
	}
}
