package com.designmode.struct.t05_flyweight;

import java.util.HashMap;

public class AnimalFactory {
	public static HashMap<AnimalEnum, Animal> hashMap = new HashMap<AnimalEnum, Animal>();
	static{
		hashMap.put(AnimalEnum.CAT, new Cat());
		hashMap.put(AnimalEnum.DOG, new Dog());
		hashMap.put(AnimalEnum.PIG, new Pig());
	}
}
