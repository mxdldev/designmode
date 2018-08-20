package com.designmode.action.t10_explain;
/**
 * 解释器模式：建立了一套解释语言，是灵活多变的计算公式，变得很容易的处理
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		int a = 8;//(a*b + c)/(a - b)
		int b = 4;
		int c = 4;
		Mul mul = new Mul(new Value(a),new Value(b));
		Add add = new Add(mul,new Value(c));
		Sub sub = new Sub(new Value(a),new Value(b));
		Div div = new Div(add,sub);
		int result = div.process();
		System.out.println(result);
	}
}
