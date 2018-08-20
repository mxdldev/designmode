package com.designmode.struct.t06_bridge;

public abstract class Company {
	private IProduct product;
	public Company(IProduct product){
		this.product = product;
	}
	public void makeMoney(){
		product.produce();
		product.sale();
	}
}
