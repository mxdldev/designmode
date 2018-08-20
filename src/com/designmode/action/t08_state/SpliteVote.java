package com.designmode.action.t08_state;

public class SpliteVote implements VoteState{
	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		String vote = voteManager.getVoteMap().get(user);
		if(vote != null)
			voteManager.getVoteMap().remove(user);
		System.out.println("你这是恶意刷票啊...");
	}
}
