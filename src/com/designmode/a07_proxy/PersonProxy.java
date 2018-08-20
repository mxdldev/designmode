package com.designmode.a07_proxy;

public class PersonProxy {
	private Person person;
	public PersonProxy(Person person){
		this.person = person;
	}
	public void speekChinese(){
		person.speekChinese();
	};
	public void speekEnglish(){
		person.speekEnglish();
	}
}
