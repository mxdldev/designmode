package com.designmode.action.t10_explain;

public class Value extends Explain {
	private int value;
	public Value(int value){
		this.value = value;
	}
	@Override
	public int process() {
		return this.value;
	}

}
