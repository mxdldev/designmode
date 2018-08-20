package com.designmode.create.t03_factory.t3_abstractfactory;

public abstract class AbstractFactory {
	public abstract Person createYellowPerson();
	public abstract Person createBalckPerson();
	public abstract Person createWhitePerson();
	public Person createPerson(PersonEnum personEnum) {
		switch (personEnum) {
		case YELLOW_MAN:
			return new YellowPersonMan();
		case YELLOW_WOMAN:
			return new YellowPersonWoman();
		case WHITE_MAN:
			return new WhitePersonMan();
		case WHITE_WOMAN:
			return new WhitePersonWoman();
		case BLACK_MAN:
			return new BlackPersonMan();
		case BLACK_WOMAN:
			return new BlackPersonWoman();
		default:
			break;
		}
		return null;
	}
}
