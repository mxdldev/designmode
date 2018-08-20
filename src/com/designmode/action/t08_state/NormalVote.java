package com.designmode.action.t08_state;

public class NormalVote implements VoteState{
	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		voteManager.getVoteMap().put(user, voteItem);
		System.out.println("恭喜你！投票成功...");
	}
}
