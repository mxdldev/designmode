package com.designmode.create.t05_prototype;

import java.io.IOException;
/**
 * 原型模式：实现了复制克隆对象
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		Person p = new Person();
		p.setAge(22);
		p.setName("zhang san");
		
		Car car = new Car();
		car.setAge(88);
		car.setName("88");
		
		p.setCat(car);
		
		//Person p1 = (Person) p.clone();
		Person p1 = p.deepCopy();
		p1.setName("li siff");
		p1.getCat().setAge(99);
		
		System.out.println(p.toString());
		System.out.println(p1.toString());
	}

}
