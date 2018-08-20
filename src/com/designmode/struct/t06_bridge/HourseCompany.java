package com.designmode.struct.t06_bridge;

public class HourseCompany extends Company {

	public HourseCompany(IProduct product) {
		super(product);
	}
	@Override
	public void makeMoney() {
		super.makeMoney();
		System.out.println("搞房地产赚大发了...");
	}
}
