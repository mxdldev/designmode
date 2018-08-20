package com.designmode.create.t01_single;
/**
 * 单例模式：内存中只有一份对象的实例
 * @author Administrator
 *
 */
public class DatabaseHelper {
	private static DatabaseHelper mDatabaseHelper;
	private DatabaseHelper(){};
	public static DatabaseHelper getInstance(){
		if(mDatabaseHelper == null){
			synchronized (DatabaseHelper.class) {
				if(mDatabaseHelper == null){
					mDatabaseHelper = new DatabaseHelper();
				}
			}
		}
		return mDatabaseHelper;
	}
}
