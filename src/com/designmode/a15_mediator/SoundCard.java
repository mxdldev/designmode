package com.designmode.a15_mediator;

public class SoundCard{
	private MainBoard mianBoard;
	public SoundCard(MainBoard mianBoard){
		this.mianBoard = mianBoard;
	}
	public void showData(String data){
		System.out.println("声音数据播放了..."+data);
	}
}
