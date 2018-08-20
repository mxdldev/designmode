package com.designmode.a20_state;

public class SpiteVote implements IVote {

	@Override
	public void vote(String name, String voteitem) {
		System.out.println("恶意刷票..");
	}

}
