package com.designmode.action.t03_mediator;
/**
 * 中介者模式：将多个对象之间复杂的多对多关系，转化为多个一对一的关系，通过事件分发器来控件程序的流程
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Mainboard mainboard = new Mainboard();
		CDdriver cDdriver = new CDdriver(mainboard);
		CPU cpu = new CPU(mainboard);
		SoundCard soundCard = new SoundCard(mainboard);
		VedioCard vedioCard = new VedioCard(mainboard);
		
		mainboard.setcDdriver(cDdriver);
		mainboard.setCpu(cpu);
		mainboard.setSoundCard(soundCard);
		mainboard.setVedioCard(vedioCard);
		
		cDdriver.readData("音频,视频");
	}
}
