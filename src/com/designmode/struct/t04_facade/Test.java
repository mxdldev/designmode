package com.designmode.struct.t04_facade;
/**
 * 门面模式：将多个方法通过另外一个方法进行封装
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Letter letter = new Letter();
		letter.postLetter("I miss you", "bei jing");
	}
}
