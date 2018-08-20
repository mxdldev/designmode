package com.designmode.struct.t03_decorator;
/**
 * 装饰模式：通过装饰增强了一个类的功能，和代理有些像
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		CityPerson cityPerson = new CityPerson(new Person());
		cityPerson.eating();
	}

}
