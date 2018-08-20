package com.designmode.a08_decoretor;

public class PersonNew {
	private Person person;
	public PersonNew(Person person){
		this.person = person;
	}
	public void eat(){
		System.out.println("喝一杯");
		person.eat();
		System.out.println("抽一根");
	}
}
