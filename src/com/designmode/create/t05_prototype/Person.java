package com.designmode.create.t05_prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Cloneable,Serializable{
	private String name;
	private int age;
	private Car cat;
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
	public Car getCat() {
		return cat;
	}
	public void setCat(Car cat) {
		this.cat = cat;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person p = (Person) super.clone();
		p.setCat((Car)cat.clone());
		return p;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cat=" + cat + "]";
	}
	
	public Person deepCopy() throws IOException, ClassNotFoundException{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (Person) ois.readObject();
	}
}
