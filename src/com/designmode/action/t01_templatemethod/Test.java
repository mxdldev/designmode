package com.designmode.action.t01_templatemethod;
/**
 * 模板方法模式：只定义了一个算法执行的骨架，具体的算法实现延迟到子类完成
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		p.eating();
	}
}
