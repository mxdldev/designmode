package com.designmode.a11_briage;

public class Test {
	public static void main(String[] args) {
		HouseCompany houseCompany = new HouseCompany(new HouseProduct());
		PhoneCompany phoneCompany = new PhoneCompany(new PhoneProduct());
		houseCompany.makeMoney();
		phoneCompany.makeMoney();
	}
}
