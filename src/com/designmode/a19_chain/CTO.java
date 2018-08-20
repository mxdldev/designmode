package com.designmode.a19_chain;

public class CTO implements Person {
	private int day;
	private Person person;
	public CTO(Person person){
		this.person = person;
	}
	@Override
	public void process(int day) {
		if(day < 8){
			System.out.println("CTO process..");
		}else{
			person.process(day);
		}
	}

}
