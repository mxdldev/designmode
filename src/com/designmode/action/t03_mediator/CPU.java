package com.designmode.action.t03_mediator;

public class CPU extends BasePart {
	String soundData;
	String vedioData;
	public CPU(Mainboard mainboard) {
		super(mainboard);
	}
	public void processData(String data){
		soundData = data.split(",")[0];
		vedioData = data.split(",")[1];
		super.mainboard.action(PartEnum.SOUND_CARD);
		super.mainboard.action(PartEnum.DISPLAY_CARD);
	}
	public String getSoundData() {
		return soundData;
	}
	public void setSoundData(String soundData) {
		this.soundData = soundData;
	}
	public String getVedioData() {
		return vedioData;
	}
	public void setVedioData(String vedioData) {
		this.vedioData = vedioData;
	}	
}
