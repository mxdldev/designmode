package com.designmode.a05_prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Woman implements Cloneable,Serializable{
	private String name;
	private int age;
	private Child child;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Child getChild() {
		return child;
	}
	public void setChild(Child child) {
		this.child = child;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Woman w =  (Woman) super.clone();
		w.setChild((Child)child.clone());
		return w;
	}
	@Override
	public String toString() {
		return "Woman [name=" + name + ", age=" + age + ", child=" + child + "]";
	}
	public Woman deepClone() throws Exception{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		Object readObject = ois.readObject();
		return (Woman) readObject;
	}
}
