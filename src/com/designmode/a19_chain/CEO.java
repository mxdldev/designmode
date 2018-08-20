package com.designmode.a19_chain;

public class CEO implements Person {
	private int day;
	private Person person;
	@Override
	public void process(int day) {
			System.out.println("CEO process..");
	}

}
