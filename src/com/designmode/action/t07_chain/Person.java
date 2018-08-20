package com.designmode.action.t07_chain;

public abstract class Person {
	protected Person person;
	public abstract void process(int day);
	public void setPerson(Person person) {
		this.person = person;
	}
}
