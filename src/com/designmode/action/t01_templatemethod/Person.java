package com.designmode.action.t01_templatemethod;

public class Person implements IPerson {

	@Override
	public void eating() {
		System.out.println("eating");
	}

	@Override
	public void working() {
		System.out.println("working");
	}

	@Override
	public void sleeping() {
		System.out.println("sleeping");
	}
}
