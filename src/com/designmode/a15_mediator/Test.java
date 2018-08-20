package com.designmode.a15_mediator;

public class Test {
	public static void main(String[] args) {
		MainBoard mainBoard = new MainBoard();
		Cddriver cddriver = new Cddriver(mainBoard);
		Cpu cpu = new Cpu(mainBoard);
		SoundCard soundCard = new SoundCard(mainBoard);
		VedioCard vedioCard = new VedioCard(mainBoard);
		
		mainBoard.setCddriver(cddriver);
		mainBoard.setCpu(cpu);
		mainBoard.setSoundCard(soundCard);
		mainBoard.setVedioCard(vedioCard);
		cddriver.readData("这是音频数据,这是视屏数据");
	}
}
