package com.designmode.action.t08_state;

public class BlackVote implements VoteState{
	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		System.out.println("请已经进入黑名单了，禁止登陆和使用该系统...");
	}
}
