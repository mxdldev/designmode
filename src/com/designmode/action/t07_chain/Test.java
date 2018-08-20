package com.designmode.action.t07_chain;
/**
 * 责任链模式：建立了一条业务处理链条，实现了不同的情况进行不同对象的处理
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Manager manager = new Manager();
		CTO cto = new CTO();
		CEO ceo = new CEO();
		
		manager.setPerson(cto);
		cto.setPerson(ceo);
		
		manager.process(18);
	}
}
