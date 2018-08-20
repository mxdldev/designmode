package com.designmode.a23_command;

public class StopPerson extends Person{

	public StopPerson(Icommand command) {
		super(command);
	}
	@Override
	public void process() {
		System.out.println("StopPerson..");
		super.process();
	}
}
