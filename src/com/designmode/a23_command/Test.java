package com.designmode.a23_command;

public class Test {
	public static void main(String[] args) {
		StartComand startComand = new StartComand();
		PauseComand pauseComand = new PauseComand();
		
		StartPerson statPerson = new StartPerson(startComand);
		CommandManager commandManager = new CommandManager();
		commandManager.setStartPerson(statPerson);
		commandManager.start();
	}
}
