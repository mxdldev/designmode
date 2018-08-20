package com.designmode.create.t03_factory.t1_factorymethord;
/**
 * 工厂方法模式：只能创建单一对象实例
 * @author Administrator
 *
 */
public class CatFactory {
	public static Cat createCat(){
		return new Cat();
	}
}
