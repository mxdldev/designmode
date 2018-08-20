package com.designmode.struct.t02_proxy;
/**
 * 代理模式：通过代理类实现了对另外一个类的引用，并且可以添加相关业务逻辑
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		PersonProxy personProxy = new PersonProxy();
		personProxy.washing();
		personProxy.cooking();
		personProxy.buying();
	}

}
