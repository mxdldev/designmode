package com.designmode.a09_face;

public class Person {
	public void createHeader(){
		System.out.println("createHeader");
	};
	public void createBody(){
		System.out.println("createBody");
	};
	public void createFooter(){
		System.out.println("createFooter");
	};
	public void createPerson(){
		createHeader();
		createBody();
		createFooter();
	}
}
