package com.designmode.action.t07_chain;

public class CTO extends Person {

	@Override
	public void process(int day) {
		if(day < 10){
			System.err.println("CTO process...");
		}else{
			super.person.process(day);
		}
	}

}
