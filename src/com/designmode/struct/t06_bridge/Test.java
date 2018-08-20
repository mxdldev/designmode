package com.designmode.struct.t06_bridge;
/**
 * 桥梁模式：它实现了对象的抽象和实现相分离，建立了一种多对多的对象关系
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		HourseCompany c1 = new HourseCompany(new Hourse());
		c1.makeMoney();
		
		PhoneCompany c2 = new PhoneCompany(new Phone());
		c2.makeMoney();
	}
}
