package com.designmode.a19_chain;

public class Test {
	public static void main(String[] args) {
		CEO ceo = new CEO();
		CTO cto = new CTO(ceo);
		Manager manager = new Manager(cto);
		manager.process(16);
	}
}
