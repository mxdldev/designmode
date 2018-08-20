package com.designmode.a11_briage;

public class PhoneCompany extends Company{
	PhoneCompany(IProduct product) {
		super(product);
	}

	public void makeMoney(){
		super.makeMoney();
		System.out.println("搞手机赚大发了..");
	}
}
