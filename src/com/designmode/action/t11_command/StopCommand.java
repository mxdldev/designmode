package com.designmode.action.t11_command;

public class StopCommand implements Command {
	private IReceiverCommand receiverCommand;
	public StopCommand(IReceiverCommand receiverCommand){
		this.receiverCommand = receiverCommand;
	}
	@Override
	public void execute() {
		receiverCommand.stop();
	}

}
