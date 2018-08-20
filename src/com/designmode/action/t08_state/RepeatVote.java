package com.designmode.action.t08_state;

public class RepeatVote implements VoteState{
	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		System.out.println("请不要重复投票...");
	}
}
