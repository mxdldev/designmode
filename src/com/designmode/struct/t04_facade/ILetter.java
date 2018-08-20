package com.designmode.struct.t04_facade;

public interface ILetter {
	public void writeLetter(String content);
	public void writeEnvelop(String address);
	public void intoEnvelop();
	public void sendLetter();
	public void postLetter(String content,String address);
}
