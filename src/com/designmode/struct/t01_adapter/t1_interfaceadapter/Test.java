package com.designmode.struct.t01_adapter.t1_interfaceadapter;
/**
 * 接口适配器：适配了接口和抽象类，使实现代码变得简洁美观
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		PersonAdapter adapter = new PersonAdapter(){
			@Override
			public void eat() {
				System.out.println("小胖吃饭了");
			}
		};
		adapter.eat();
	}
}
