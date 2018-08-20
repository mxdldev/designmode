package com.designmode.action.t04_observer;

import java.util.Observable;
import java.util.Observer;

public class Man implements Observer{
	@Override
	public void update(Observable arg0, Object arg1) {
		if(arg1 instanceof Float){
			System.out.println("man receive:"+(Float)arg1);
		}
	}
}
