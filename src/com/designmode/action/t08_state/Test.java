package com.designmode.action.t08_state;
/**
 * 状态模式：不同对象的状态，进行不同的处理，建立了一种一对多的处理关系
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		VoteManager voteManager = new VoteManager();
		for(int i = 0; i < 8; i++)
			voteManager.vote("111", "A");
		voteManager.vote("333", "A");
		voteManager.vote("3332", "A");
	}
}
