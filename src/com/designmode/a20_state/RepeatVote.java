package com.designmode.a20_state;

public class RepeatVote implements IVote {

	@Override
	public void vote(String name, String voteitem) {
		System.out.println("重复投票..");
	}

}
