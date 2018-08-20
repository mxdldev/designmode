package com.designmode.action.t02_strategy;
/**
 * 策略模式：建立了一个数据表示和数据处理之间的一个，一对多的对应关系，可以再多个算法之间灵活切换
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Person person = new Person(new PlayFootball());
		Person person1 = new Person(new WatchFilm());
		Person person2 = new Person(new Swimming());
		person.sport();
		person1.sport();
		person2.sport();
	}
}
