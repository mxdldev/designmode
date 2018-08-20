package com.designmode.struct.t06_bridge;

public class PhoneCompany extends Company {

	public PhoneCompany(IProduct product) {
		super(product);
	}
	@Override
	public void makeMoney() {
		super.makeMoney();
		System.out.println("搞智能手机赚大发了...");
	}
}
