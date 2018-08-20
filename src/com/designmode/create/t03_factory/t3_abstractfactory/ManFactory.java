package com.designmode.create.t03_factory.t3_abstractfactory;

public class ManFactory extends AbstractFactory {
	@Override
	public Person createYellowPerson() {
		return createPerson(PersonEnum.YELLOW_MAN);
	}

	@Override
	public Person createBalckPerson() {
		return createPerson(PersonEnum.BLACK_MAN);
	}

	@Override
	public Person createWhitePerson() {
		return createPerson(PersonEnum.WHITE_MAN);
	}
}
