package com.designmode.create.t04_builder;
/**
 * 建造者模式：实现了对象的表示和创建相分离
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		PersonBuilder builder = new PersonBuilder();
		builder.buildHead();
		builder.buildBody();
		builder.buildFoot();
		System.out.println(builder.buildPerson().toString());
	}
}
