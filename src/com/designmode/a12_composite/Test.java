package com.designmode.a12_composite;

public class Test {
	public static void main(String[] args) {
		File f1 = new File();
		File f2 = new File();
		File f3 = new File();
		Forder forder1 = new Forder();
		forder1.addNode(f1);
		forder1.addNode(f2);
		
		Forder forder2 = new Forder();
		forder2.addNode(forder1);
		forder2.addNode(f3);
		
	}
}
