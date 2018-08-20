package com.designmode.struct.t01_adapter.t2_classadapter;

public class Person implements IPerson {
	@Override
	public void speakChinese() {
		System.out.println("speak chinese");
	}

	@Override
	public void speakEnglish() {
		System.out.println("speak english");
	}
}
