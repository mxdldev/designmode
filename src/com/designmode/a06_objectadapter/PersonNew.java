package com.designmode.a06_objectadapter;

public class PersonNew {
	private Person person;
	public PersonNew(Person person){
		this.person = person;
	}
	public void speekChinese(){
		person.speekChinese();
	};
	public void speekEnglish(){
		person.speekEnglish();
	}
	public void speekJpan(){
		System.out.println("speekJpan");
	}
}
