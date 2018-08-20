package com.designmode.struct.t05_flyweight;

public enum AnimalEnum {
	CAT("cat"),DOG("dog"),PIG("pig");
	AnimalEnum(String type) {
	 this.type = type;
	};
	String type;
}
