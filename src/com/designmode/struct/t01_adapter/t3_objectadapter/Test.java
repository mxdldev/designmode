package com.designmode.struct.t01_adapter.t3_objectadapter;
/**
 * 对象适配器：通过弱关联来适配一个对象，并扩展了相关方法
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		PersonAdapter adapter = new PersonAdapter();
		adapter.speakChinese();
		adapter.speakEnglish();
		adapter.speakJpan();
	}

}
