package com.designmode.a21_mementto;

public class Person {
	private Integer a;
	private Integer b;
	private Integer c;
	private Mementto mementto;
	
	public Person(Integer a, Integer b, Integer c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Integer getA() {
		return a;
	}
	public void setA(Integer a) {
		this.a = a;
	}
	public Integer getB() {
		return b;
	}
	public void setB(Integer b) {
		this.b = b;
	}
	public Integer getC() {
		return c;
	}
	public void setC(Integer c) {
		this.c = c;
	}
	public Mementto setMementto(){
		mementto = new Mementto();
		mementto.setA(a);
		mementto.setB(b);
		mementto.setC(c);
		return mementto;
	}
	public void reMementto(Mementto mementto){
		a = mementto.getA();
		b = mementto.getB();
		c = mementto.getC();
	}
	@Override
	public String toString() {
		return "Person [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}
