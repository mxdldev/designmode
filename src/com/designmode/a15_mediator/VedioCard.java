package com.designmode.a15_mediator;

public class VedioCard{
	private MainBoard mianBoard;
	public VedioCard(MainBoard mianBoard){
		this.mianBoard = mianBoard;
	}
	public void showData(String data){
		System.out.println("视频数据播放了..."+data);
	}
}
