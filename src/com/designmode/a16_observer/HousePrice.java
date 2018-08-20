package com.designmode.a16_observer;

import java.util.Observable;

public class HousePrice extends Observable{
	private float price;
	public void changePrice(float price){
		this.price = price;
		super.setChanged();
		super.notifyObservers(price);
	}
}
