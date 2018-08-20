package com.designmode.create.t01_single;

public class DatabaseHelper1 {
	private static DatabaseHelper1 mDatabaseHelper = new DatabaseHelper1();
	private DatabaseHelper1(){};
	public static DatabaseHelper1 getInstance(){
		return mDatabaseHelper;
	}
}
