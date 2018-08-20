package com.designmode.a23_command;

public class StartComand implements Icommand{

	@Override
	public void process() {
		System.out.println("播放开始了");
	}
}
