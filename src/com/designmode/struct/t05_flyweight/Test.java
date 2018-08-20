package com.designmode.struct.t05_flyweight;
/**
 * 享元模式：将n多经常会用到的对象塞到一个容器，方便了调用，避免了重复创建对象
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		Animal cat = AnimalFactory.hashMap.get(AnimalEnum.CAT);
		Animal dog = AnimalFactory.hashMap.get(AnimalEnum.DOG);
		Animal pig = AnimalFactory.hashMap.get(AnimalEnum.PIG);
		cat.eat();
		dog.eat();
		pig.eat();
	}
}
