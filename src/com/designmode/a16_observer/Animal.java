package com.designmode.a16_observer;

import java.util.Observable;
import java.util.Observer;

public class Animal implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		if(arg1 instanceof Float){
			System.out.println("Animal收到了："+(Float)arg1);
		}
	}

}
