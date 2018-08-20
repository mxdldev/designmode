package com.designmode.a03_abstractfactory;

public class WhitePersonWoman extends WhitePerson {
	@Override
	public void eat() {
		System.out.println("WhitePersonWoman eat");
	}
	@Override
	public void study() {
		System.out.println("WhitePersonWoman study");
	}
	@Override
	public void sleep() {
		System.out.println("WhitePersonWoman sleep");
	}
}
