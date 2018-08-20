package com.designmode.action.t09_mementto;
/**
 * 备忘录模式：通过备忘录实现了对数据的备份和恢复
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Boss boss = new Boss(1,2,4);
		System.out.println(boss.toString());
		ManagerMementto managerMementto = new ManagerMementto();
		managerMementto.setMementto(boss.createMementto());
		boss.setAggressivity(222);
		boss.setDefense(22311);
		boss.setVitality(56);
		System.out.println(boss.toString());
		
		boss.recoverFromMementto(managerMementto.getMementto());
		System.out.println(boss.toString());
	}
}
