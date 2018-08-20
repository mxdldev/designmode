package com.designmode.create.t03_factory.t3_abstractfactory;

public class WomanFactory extends AbstractFactory {

	@Override
	public Person createYellowPerson() {
		return createPerson(PersonEnum.YELLOW_WOMAN);
	}

	@Override
	public Person createBalckPerson() {
		return createPerson(PersonEnum.BLACK_WOMAN);
	}

	@Override
	public Person createWhitePerson() {
		return createPerson(PersonEnum.WHITE_WOMAN);
	}
}
