package com.designmode.struct.t04_facade;

public class Letter implements ILetter {

	@Override
	public void writeLetter(String content) {
		System.out.println("content:" + content);
	}

	@Override
	public void writeEnvelop(String address) {
		System.out.println("address:" + address);
	}

	@Override
	public void intoEnvelop() {
		System.out.println("intoEnvelop...");
	}

	@Override
	public void sendLetter() {
		System.out.println("sendLetter...");
	}

	@Override
	public void postLetter(String content, String address){
		writeLetter(content);
		writeEnvelop(address);
		intoEnvelop();
		sendLetter();
	}
}
