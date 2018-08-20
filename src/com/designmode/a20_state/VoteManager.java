package com.designmode.a20_state;

import java.util.HashMap;
import java.util.Map;

public class VoteManager {
	private IVote vote;
	private Map<String,String> voteMap = new HashMap<String,String>();
	private Map<String,Integer> countMap = new HashMap<String,Integer>();
	public void voite(String name,String voteitem){
		voteMap.put(name, voteitem);
		Integer count = countMap.get(name);
		if(count == null){
			count = 0;
		}
		count++;
		countMap.put(name, count);
		if(count == 1){
			vote = new NormalVote();
		}else if(count < 5){
			vote = new RepeatVote();
		}else if(count < 10){
			vote = new SpiteVote();
		}else{
			vote = new BlackVote();
		}
		vote.vote(name, voteitem);
	}
}
