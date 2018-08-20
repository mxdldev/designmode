package com.designmode.action.t03_mediator;

public class SoundCard extends BasePart {
	public SoundCard(Mainboard mainboard) {
		super(mainboard);
	}
	public void playData(String data){
		System.out.println("sound play" + data);
	}	
}
