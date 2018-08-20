package com.designmode.a01_single;

public class Single {
	private Single single;
	private Single(){};
	public Single getInstance(){
		if(single == null){
			synchronized (Single.class) {
				if(single == null)
					single = new Single();
			}
		}
		return single;
	}
	
}
