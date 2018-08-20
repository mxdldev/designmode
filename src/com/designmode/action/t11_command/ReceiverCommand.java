package com.designmode.action.t11_command;

public class ReceiverCommand implements IReceiverCommand{
	public void start(){
		System.out.println("start");
	}
	public void pause(){
		System.out.println("pause");
	}
	public void stop(){
		System.out.println("stop");
	}
}
