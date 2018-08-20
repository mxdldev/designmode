package com.designmode.struct.t06_bridge;

public class Hourse implements IProduct {
	@Override
	public void produce() {
		System.out.println("produce hourse");
	}
	@Override
	public void sale() {
		System.out.println("sale hourse");
	}
}
