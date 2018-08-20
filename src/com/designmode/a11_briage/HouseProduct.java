package com.designmode.a11_briage;

public class HouseProduct implements IProduct {

	@Override
	public void product() {
		System.out.println("house product");
	}

	@Override
	public void sale() {
		System.out.println("house sale");
	}

}
