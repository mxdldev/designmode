package com.designmode.struct.t02_proxy;

public class Person implements IPerson {

	@Override
	public void washing() {
		System.out.println("washing");
	}

	@Override
	public void cooking() {
		System.out.println("cooking");
	}

	@Override
	public void buying() {
		System.out.println("buying");
	}
}
