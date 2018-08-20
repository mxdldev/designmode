package com.designmode.a20_state;

public class NormalVote implements IVote {

	@Override
	public void vote(String name, String voteitem) {
		System.out.println("正常投票..");
	}

}
