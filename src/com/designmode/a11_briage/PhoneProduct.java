package com.designmode.a11_briage;

public class PhoneProduct implements IProduct {

	@Override
	public void product() {
		System.out.println("phone product");
	}

	@Override
	public void sale() {
		System.out.println("phone sale");
	}

}
