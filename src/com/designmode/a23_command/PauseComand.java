package com.designmode.a23_command;

public class PauseComand implements Icommand{

	@Override
	public void process() {
		System.out.println("播放暂停了");
	}
}
