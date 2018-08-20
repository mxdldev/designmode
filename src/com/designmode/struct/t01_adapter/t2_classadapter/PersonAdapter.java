package com.designmode.struct.t01_adapter.t2_classadapter;

public class PersonAdapter extends Person implements IPersonNew {
	@Override
	public void speakJpan() {
		System.out.println("speak japanese");
	}
}
