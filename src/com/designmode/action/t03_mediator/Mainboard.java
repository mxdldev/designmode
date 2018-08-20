package com.designmode.action.t03_mediator;

public class Mainboard {
	private CDdriver cDdriver;
	private CPU cpu;
	private SoundCard soundCard;
	private VedioCard vedioCard;
	public void action(PartEnum partEnum){
		switch (partEnum) {
		case CDDRIVER:
			cpu.processData(cDdriver.getData());
			break;
		case SOUND_CARD:
			soundCard.playData(cpu.getSoundData());
			break;
		case DISPLAY_CARD:
			vedioCard.playData(cpu.getVedioData());
			break;
		default:
			break;
		}
	}
	public CDdriver getcDdriver() {
		return cDdriver;
	}
	public void setcDdriver(CDdriver cDdriver) {
		this.cDdriver = cDdriver;
	}
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public SoundCard getSoundCard() {
		return soundCard;
	}
	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}
	public VedioCard getVedioCard() {
		return vedioCard;
	}
	public void setVedioCard(VedioCard vedioCard) {
		this.vedioCard = vedioCard;
	}
}
