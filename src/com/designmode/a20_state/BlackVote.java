package com.designmode.a20_state;

public class BlackVote implements IVote {

	@Override
	public void vote(String name, String voteitem) {
		System.out.println("你已经进入黑名单..");
	}

}
