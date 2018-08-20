package com.designmode.action.t05_vistior;
/**
 * 访问者模式：实现了数据表示和数据访问相分离，降低了代码间的耦合度，适用于数据结构较为稳定的对象
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Vistor vistor = new Vistor();
		Cat cat = new Cat();
		cat.vistor(vistor);
		
		Dog dog = new Dog();
		dog.vistor(vistor);
		
		Pig pig = new Pig();
		pig.vistor(vistor);
	}
}
