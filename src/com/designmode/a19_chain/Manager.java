package com.designmode.a19_chain;

public class Manager implements Person {
	private int day;
	private Person person;
	public Manager(Person person){
		this.person = person;
	}
	@Override
	public void process(int day) {
		if(day < 3){
			System.out.println("Manager process..");
		}else{
			person.process(day);
		}
	}

}
