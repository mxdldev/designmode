package com.designmode.a22_explain;

public class Test {
	public static void main(String[] args) {
		//计算：(a+b - c)/(a-b)
		int a = 7;
		int b = 3;
		int c = 2;
		Add add = new Add(new Value(a),new Value(b));
		Sub sub = new Sub(add,new Value(c));
		Sub sub1 = new Sub(new Value(a),new Value(b));
		Div dis = new Div(sub,sub1);
		Integer i = dis.process();
		System.out.println(i);
	}
}
