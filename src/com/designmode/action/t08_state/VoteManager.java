package com.designmode.action.t08_state;

import java.util.HashMap;

public class VoteManager {
	private HashMap<String,String> voteMap = new HashMap<String,String>();
	private HashMap<String,Integer> countMap = new HashMap<String,Integer>();
	private VoteState voteState;
	public void vote(String user,String voteItem){
		Integer count = countMap.get(user);
		if(count == null)
			count = 0;
		count++;
		countMap.put(user, count);
		if(count == 1){
			voteState = new NormalVote();
		}else if(count < 5){
			voteState = new RepeatVote();
		}else if(count < 8){
			voteState = new SpliteVote();
		}else{
			voteState = new BlackVote();
		}
		voteState.vote(user, voteItem, this);
	}
	public HashMap<String, String> getVoteMap() {
		return voteMap;
	}
	public void setVoteMap(HashMap<String, String> voteMap) {
		this.voteMap = voteMap;
	}
	public HashMap<String, Integer> getCountMap() {
		return countMap;
	}
	public void setCountMap(HashMap<String, Integer> countMap) {
		this.countMap = countMap;
	}
}
