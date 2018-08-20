package com.designmode.a04_builder;

public class BuilderPerson {
	private Person person;
	public BuilderPerson(){
		person = new Person();
	}
	public void createHeader(){
		person.createHeader();
	}
	public void createBody(){
		person.createBody();
	}
	public void createFooter(){
		person.createFooter();
	}
	public Person builderPerson(){
		return person;
	}
}
