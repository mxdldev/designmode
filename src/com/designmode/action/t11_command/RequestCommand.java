package com.designmode.action.t11_command;

public class RequestCommand {
	private Command startCommand;
	private Command pauseCommand;
	private Command stopCommand;
	
	public Command getStartCommand() {
		return startCommand;
	}
	public void setStartCommand(Command startCommand) {
		this.startCommand = startCommand;
	}
	public Command getPauseCommand() {
		return pauseCommand;
	}
	public void setPauseCommand(Command pauseCommand) {
		this.pauseCommand = pauseCommand;
	}
	public Command getStopCommand() {
		return stopCommand;
	}
	public void setStopCommand(Command stopCommand) {
		this.stopCommand = stopCommand;
	}
	
	public void start(){
		startCommand.execute();
	}
	public void pause(){
		pauseCommand.execute();
	}
	public void stop(){
		stopCommand.execute();
	}
}
