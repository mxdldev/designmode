package com.designmode.a11_briage;

public class Company {
	private IProduct product;
	Company (IProduct  product){
		this.product = product;
	}
	public void makeMoney(){
		product.product();
		product.sale();
	}
}
