package com.designmode.create.t02_moresingle;
/**
 * 多例模式：内存中有固定个数的对象，多一个不行，少一个也不行
 * @author Administrator
 *
 */
public class Dice {
	private static Dice mDice1 = new Dice();
	private static Dice mDice2 = new Dice();
	private Dice(){};
}
