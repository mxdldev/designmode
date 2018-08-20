package com.designmode.a03_abstractfactory;

public class Test {
	public static void main(String[] args) {
		ManFactory manFactory = new ManFactory();
		IPerson createBlackPerson = manFactory.createBlackPerson();
		IPerson createWhitePerson = manFactory.createWhitePerson();
		IPerson createYellowPerson = manFactory.createYellowPerson();
		createBlackPerson.eat();
		createWhitePerson.eat();
		createYellowPerson.eat();
		
		WomanFactory womanFactory = new WomanFactory();
		IPerson createYellowPerson2 = womanFactory.createYellowPerson();
		IPerson createBlackPerson2 = womanFactory.createBlackPerson();
		IPerson createWhitePerson2 = womanFactory.createWhitePerson();
		createYellowPerson2.eat();
		createBlackPerson2.eat();
		createWhitePerson2.eat();
	}
}
