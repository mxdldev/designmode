package com.designmode.create.t03_factory.t3_abstractfactory;

public enum PersonEnum {
	YELLOW_MAN("com.designmode.create.factory.abstractfactory.YellowPersonMan"),
	YELLOW_WOMAN("com.designmode.create.factory.abstractfactory.YellowPersonWoman"),
	WHITE_MAN("com.designmode.create.factory.abstractfactory.WhitePersonMan"),
	WHITE_WOMAN("com.designmode.create.factory.abstractfactory.WhitePersonWoman"),
	BLACK_MAN("com.designmode.create.factory.abstractfactory.BlackPersonMan"),
	BLACK_WOMAN("com.designmode.create.factory.abstractfactory.BlackPersonWoman");
	PersonEnum(String type){
		this.type = type;
	}
	private String type;
}
