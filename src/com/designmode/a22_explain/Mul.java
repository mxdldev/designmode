package com.designmode.a22_explain;

public class Mul implements Explain {
	private Explain left;
	private Explain right;
	public Mul(Explain left,Explain right){
		this.left = left;
		this.right = right;
	}
	@Override
	public Integer process() {
		return left.process() * right.process();
	}
	
}
