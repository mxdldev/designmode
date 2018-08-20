package com.designmode.action.t11_command;
/**
 * 命令模式：实现了命令发送和命令处理相分离，增加了程序的灵活性
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		ReceiverCommand receiverCommand = new ReceiverCommand();
		RequestCommand requestCommand = new RequestCommand();
		StartCommand startCommand = new StartCommand(receiverCommand);
		requestCommand.setStartCommand(startCommand);
		requestCommand.start();
	}
}
