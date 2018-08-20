package com.designmode.a15_mediator;

public class Cpu{
	private MainBoard mianBoard;
	private String soundData;
	private String vedioData;
	
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
	public Cpu(MainBoard mianBoard){
		this.mianBoard = mianBoard;
	}
	public void process(String data){
		soundData = data.split(",")[0];
		vedioData = data.split(",")[1];
		mianBoard.process(PartEnum.SOUND_CARD);
	}
}
