package com.designmode.a11_briage;

public class HouseCompany extends Company{
	HouseCompany(IProduct product) {
		super(product);
	}

	public void makeMoney(){
		super.makeMoney();
		System.out.println("搞房地产赚大发了..");
	}
}
