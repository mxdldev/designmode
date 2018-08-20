package com.designmode.action.t11_command;

public class StartCommand implements Command {
	private IReceiverCommand receiverCommand;
	public StartCommand(IReceiverCommand receiverCommand){
		this.receiverCommand = receiverCommand;
	}
	@Override
	public void execute() {
		receiverCommand.start();
	}

}
