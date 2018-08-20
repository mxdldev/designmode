package com.designmode.a04_builder;

public class Test {
	public static void main(String[] args) {
		BuilderPerson p = new BuilderPerson();
		p.createBody();
		p.createHeader();
		p.createFooter();
		
		Person builderPerson = p.builderPerson();
	
	}
}
