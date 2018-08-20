package com.designmode.a23_command;

public class StopComand implements Icommand{

	@Override
	public void process() {
		System.out.println("播放停止了");
	}
}
