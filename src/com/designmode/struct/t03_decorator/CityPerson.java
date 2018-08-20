package com.designmode.struct.t03_decorator;

public class CityPerson {
	private Person person;
	public CityPerson(Person person){
		this.person = person;
	}
	public void eating(){
		System.out.println("喝一杯");
		person.eating();
		System.out.println("吃点水果");
		System.out.println("来一根儿");
	}
}
