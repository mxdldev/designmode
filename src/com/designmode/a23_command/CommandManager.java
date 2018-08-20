package com.designmode.a23_command;

public class CommandManager {
	private Person startPerson;
	private Person stopPerson;
	private Person pausePerson;
	public void start(){
		startPerson.process();
	}
	public void stop(){
		stopPerson.process();
	}
	public void pause(){
		pausePerson.process();
	}
	public Person getStartPerson() {
		return startPerson;
	}
	public void setStartPerson(Person startPerson) {
		this.startPerson = startPerson;
	}
	public Person getStopPerson() {
		return stopPerson;
	}
	public void setStopPerson(Person stopPerson) {
		this.stopPerson = stopPerson;
	}
	public Person getPausePerson() {
		return pausePerson;
	}
	public void setPausePerson(Person pausePerson) {
		this.pausePerson = pausePerson;
	}
}
