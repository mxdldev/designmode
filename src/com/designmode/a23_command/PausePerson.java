package com.designmode.a23_command;

public class PausePerson extends Person{

	public PausePerson(Icommand command) {
		super(command);
	}
	@Override
	public void process() {
		System.out.println("PausePerson..");
		super.process();
	}
}
