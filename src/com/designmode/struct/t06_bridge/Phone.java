package com.designmode.struct.t06_bridge;

public class Phone implements IProduct {
	@Override
	public void produce() {
		System.out.println("Phone produce");
	}

	@Override
	public void sale() {
		System.out.println("phone sale");
	}
}
