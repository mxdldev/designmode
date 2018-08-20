package com.designmode.action.t03_mediator;

public class CDdriver extends BasePart {
	private String data;
	public CDdriver(Mainboard mainboard) {
		super(mainboard);
	}
	public void readData(String data){
		this.data = data;
		super.mainboard.action(PartEnum.CDDRIVER);
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}	
}
