package com.designmode.struct.t02_proxy;

public class PersonProxy implements IPerson{
	private Person person = new Person();
	@Override
	public void washing() {
		person.washing();
	}

	@Override
	public void cooking() {
		person.cooking();
	}

	@Override
	public void buying() {
		person.buying();
	}

}
