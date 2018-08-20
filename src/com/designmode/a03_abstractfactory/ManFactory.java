package com.designmode.a03_abstractfactory;

public class ManFactory extends FactoryPerson{

	@Override
	public IPerson createYellowPerson() {
		return new YellowPersonMan();
	}

	@Override
	public IPerson createWhitePerson() {
		return new WhitePersonMan();
	}

	@Override
	public IPerson createBlackPerson() {
		return new BlackPersonMan();
	}

}
