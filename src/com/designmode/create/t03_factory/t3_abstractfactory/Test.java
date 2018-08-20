package com.designmode.create.t03_factory.t3_abstractfactory;
/**
 * 抽象工厂模式：建立了一套工厂创建模板
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ManFactory mManFactory = new ManFactory();
		Person p1 = mManFactory.createYellowPerson();
		Person p2 = mManFactory.createWhitePerson();
		Person p3 =  mManFactory.createBalckPerson();
		p1.eat();
		p2.eat();
		p3.eat();
	}

}
