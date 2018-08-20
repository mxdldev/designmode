package com.designmode.action.t11_command;

public class PuaseCommand implements Command {
	private IReceiverCommand receiverCommand;
	public PuaseCommand(IReceiverCommand receiverCommand){
		this.receiverCommand = receiverCommand;
	}
	@Override
	public void execute() {
		receiverCommand.pause();
	}

}
