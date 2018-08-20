package com.designmode.struct.t01_adapter.t3_objectadapter;

public class PersonAdapter implements IPersonNew {
	private Person person = new Person();
	@Override
	public void speakJpan() {
		System.out.println("speak japanese");
	}
	@Override
	public void speakChinese() {
		person.speakChinese();
	}
	@Override
	public void speakEnglish() {
		person.speakEnglish();
	}
}
