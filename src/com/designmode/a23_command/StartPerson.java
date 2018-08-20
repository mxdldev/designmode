package com.designmode.a23_command;

public class StartPerson extends Person{

	public StartPerson(Icommand command) {
		super(command);
	}
	@Override
	public void process() {
		System.out.println("StartPerson..");
		super.process();
	}
}
