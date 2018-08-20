package com.designmode.a22_explain;

public class Value implements Explain {
	private Integer value;
	public Value(Integer value){
		this.value = value;
	}
	@Override
	public Integer process() {
		return this.value;
	}
}
