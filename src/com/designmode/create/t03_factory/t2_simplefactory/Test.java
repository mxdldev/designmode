package com.designmode.create.t03_factory.t2_simplefactory;
/**
 * 简单工厂模式：可以创建一系列基于类基类型的子类型的对象实例
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
/*		Cat mCat = (Cat) AnimalFactory.createAnimal(Cat.class);
		mCat.eat();
*/		
		Dog mDog = (Dog) AnimalFactory.createAnimal(Dog.class);
		mDog.eat();
	}
}

