package com.designmode.action.t10_explain;

public class Add extends Explain {
	private Explain left;
	private Explain right;
	public Add(Explain left,Explain right){
		this.left = left;
		this.right = right;
	}
	@Override
	public int process() {
		return left.process() + right.process();
	}

}
