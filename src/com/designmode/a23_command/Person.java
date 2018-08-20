package com.designmode.a23_command;

public class Person {
	private Icommand command;
	public Person(Icommand command){
		this.command = command;
	}
	public void process(){
		command.process();
	}
}
