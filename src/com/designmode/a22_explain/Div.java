package com.designmode.a22_explain;

public class Div implements Explain {
	private Explain left;
	private Explain right;
	public Div(Explain left,Explain right){
		this.left = left;
		this.right = right;
	}
	@Override
	public Integer process() {
		if(right.process() == 0){
			System.out.println("除数为0了..");
			return 0;
		}
		return left.process() / right.process();
	}
	
}
