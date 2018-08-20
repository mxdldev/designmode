package com.designmode.struct.t01_adapter.t2_classadapter;
/**
 * 类适配器：通过强关联来适配一个类，并扩展了相关方法
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		PersonAdapter p = new PersonAdapter();
		p.speakChinese();
		p.speakEnglish();
		p.speakJpan();
	}

}
