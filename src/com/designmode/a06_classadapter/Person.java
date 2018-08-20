package com.designmode.a06_classadapter;

public class Person implements Iperson {

	@Override
	public void speekChinese() {
		System.out.println("speekChinese");
	}

	@Override
	public void speekEnglish() {
		System.out.println("speekEnglish");
	}

}
