package com.designmode.create.t04_builder;

public class PersonBuilder implements IPersonBuilder {
	private Person person;
	public PersonBuilder() {
		person = new Person(); 
	}
	@Override
	public void buildHead() {
		person.setHead("创建了head");
	}

	@Override
	public void buildBody() {
		person.setBody("创建了body");
	}

	@Override
	public void buildFoot() {
		person.setFoot("创建了 foot");
	}
	public Person buildPerson() {
		return person;
	}
}
