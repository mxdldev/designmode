package com.designmode.create.t02_moresingle;

public class Dice1 {
	private static Dice1 mDice1;
	private static Dice1 mDice2;
	private Dice1(){};
	public static Dice1 getInstance1(){
		if(mDice1 == null){
			synchronized (Dice1.class) {
				if(mDice1 == null)
					mDice1 = new Dice1();
			}
		}
		return mDice1;
	}

	public static Dice1 getInstance2(){
		if(mDice2 == null){
			synchronized (Dice1.class) {
				if(mDice1 == null)
					mDice1 = new Dice1();
			}
		}
		return mDice2;
	}
}
