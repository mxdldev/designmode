package com.designmode.a22_explain;

public class Sub implements Explain {
	private Explain left;
	private Explain right;
	public Sub(Explain left,Explain right){
		this.left = left;
		this.right = right;
	}
	@Override
	public Integer process() {
		return left.process() - right.process();
	}
	
}
