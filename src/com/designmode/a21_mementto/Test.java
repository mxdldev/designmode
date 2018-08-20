package com.designmode.a21_mementto;

public class Test {
	public static void main(String[] args) {
		Person person = new Person(1,2,3);
		System.out.println(person.toString());
		Mementto mementto = person.setMementto();
		
		person.setA(12);
		person.setB(22);
		person.setC(33);
		System.out.println(person.toString());
		
		person.reMementto(mementto);
		System.out.println(person.toString());
	}
}
