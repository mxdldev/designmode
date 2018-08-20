package com.designmode.action.t02_strategy;

public class Person {
	private ISport sport;
	public Person(ISport sport){
		this.sport = sport;
	}
	public void eating(){
		System.out.println("eating");
	}
	public void sleeping(){
		System.out.println("sleeping");
	}
	public void sport(){
		sport.sport();
	}
}
