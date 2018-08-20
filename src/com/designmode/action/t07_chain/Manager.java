package com.designmode.action.t07_chain;

public class Manager extends Person {

	@Override
	public void process(int day) {
		if(day < 5){
			System.err.println("Manager process...");
		}else{
			super.person.process(day);
		}
	}

}
