package com.designmode.a05_prototype;

public class Test {
	public static void main(String[] args) throws Exception {
		Child child = new Child();
		child.setAge(12);
		child.setName("zhang san");
		
		Woman woman = new Woman();
		woman.setAge(34);
		woman.setName("li si");
		woman.setChild(child);
		try {
			//Woman woman1 = (Woman) woman.clone();
			Woman woman1 = woman.deepClone();
			woman1.getChild().setName("wang wu");
			woman1.setName("zhao liu");
			System.out.println(woman.toString());
			System.out.println(woman1.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
	}
}
