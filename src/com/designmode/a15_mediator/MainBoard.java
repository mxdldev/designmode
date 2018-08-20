package com.designmode.a15_mediator;

public class MainBoard{
	private Cpu cpu;
	private Cddriver cddriver;
	private SoundCard soundCard;
	private VedioCard vedioCard;
	public void process(PartEnum part){
		switch (part) {
		case CPU:
			cpu.process(cddriver.getData());
			break;
		case SOUND_CARD:
			soundCard.showData(cpu.getSoundData());
			vedioCard.showData(cpu.getVedioData());
			break;
		default:
			break;
		}
	}
	public Cpu getCpu() {
		return cpu;
	}
	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	public Cddriver getCddriver() {
		return cddriver;
	}
	public void setCddriver(Cddriver cddriver) {
		this.cddriver = cddriver;
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
