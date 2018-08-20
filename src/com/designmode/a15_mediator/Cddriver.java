package com.designmode.a15_mediator;

public class Cddriver{
	private MainBoard mianBoard;
	private String data;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Cddriver(MainBoard mianBoard){
		this.mianBoard = mianBoard;
	}
	public void readData(String data){
		setData(data);
		mianBoard.process(PartEnum.CPU);
	}
}
