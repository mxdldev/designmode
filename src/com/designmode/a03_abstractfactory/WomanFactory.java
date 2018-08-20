package com.designmode.a03_abstractfactory;

public class WomanFactory extends FactoryPerson{

	@Override
	public IPerson createYellowPerson() {
		return new YellowPersonWoman();
	}

	@Override
	public IPerson createWhitePerson() {
		return new WhitePersonWoman();
	}

	@Override
	public IPerson createBlackPerson() {
		return new BlackPersonWoman();
	}

}
