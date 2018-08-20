package com.designmode.action.t04_observer;
/**
 * 观察者模式：建立了一种一对多的依赖关系
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Man man = new Man();
		Woman woman = new Woman();
		House house = new House();
		house.addObserver(man);
		house.addObserver(woman);
		
		house.setPrice(1111.222f);
	}
}
