package com.designmode.action.t04_observer;

import java.util.Observable;
import java.util.Observer;

public class Woman implements Observer {
	@Override
	public void update(Observable o, Object arg1) {
		if(arg1 instanceof Float){
			System.out.println("woman receive:"+(Float)arg1);
		}
	}
}
