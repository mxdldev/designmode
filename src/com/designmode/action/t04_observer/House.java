package com.designmode.action.t04_observer;

import java.util.Observable;

public class House extends Observable {
	private float price;
	public void setPrice(float price){
		this.price = price;
		this.setChanged();
		this.notifyObservers(price);
	}
}
