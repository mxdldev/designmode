package com.designmode.action.t10_explain;

public class Mul extends Explain {
	private Explain left;
	private Explain right;
	public Mul(Explain left,Explain right){
		this.left = left;
		this.right = right;
	}
	@Override
	public int process() {
		return left.process() * right.process();
	}
}
