package com.designmode.a10_flyweight;

import java.util.HashMap;

public class AnimalFactory {
	public static HashMap<Enum,Animal> hashMap = new HashMap<Enum,Animal>();
	static{
		hashMap.put(AnimalEnum.CAT, new Cat());
		hashMap.put(AnimalEnum.DOG, new Dog());
		hashMap.put(AnimalEnum.PIG, new Pig());
	}
}
