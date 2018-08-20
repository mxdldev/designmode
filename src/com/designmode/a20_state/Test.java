package com.designmode.a20_state;

public class Test {
	public static void main(String[] args) {
		VoteManager voteManager = new VoteManager();
		for(int i = 0; i < 10; i++)
			voteManager.voite("zhang san", "A");
	}
}
