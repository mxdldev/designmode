package com.designmode.action.t03_mediator;

public abstract class BasePart {
	protected Mainboard mainboard;
	public BasePart(Mainboard mainboard){
		this.mainboard = mainboard;
	}
}
