package com.designmode.action.t10_explain;

public class Div extends Explain {
	private Explain left;
	private Explain right;
	public Div(Explain left,Explain right){
		this.left = left;
		this.right = right;
	}
	@Override
	public int process() {
		int value = right.process();
		if(value == 0)
			return -1111111;
		return left.process() / right.process();
	}

}
