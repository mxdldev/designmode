package com.designmode.action.t03_mediator;

public class VedioCard extends BasePart {
	public VedioCard(Mainboard mainboard) {
		super(mainboard);
	}
	public void playData(String data){
		System.out.println("vedio play" + data);
	}	
}
