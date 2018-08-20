package com.designmode.action.t07_chain;

public class CEO extends Person {

	@Override
	public void process(int day) {
		if(day > 9){
			System.err.println("CEO process...");
		}else{
			//super.person.process(day);
		}
	}

}
