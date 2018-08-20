package com.designmode.a03_abstractfactory;

public class WhitePersonMan extends WhitePerson {
	@Override
	public void eat() {
		System.out.println("WhitePersonMan eat");
	}
	@Override
	public void study() {
		System.out.println("WhitePersonMan study");
	}
	@Override
	public void sleep() {
		System.out.println("WhitePersonMan sleep");
	}
}
