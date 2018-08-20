package com.designmode.action.t06_iterator;

import java.util.ArrayList;
import java.util.List;
/**
 * 迭代器模式：通过它可以完成数据的迭代输出
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("zhang san");
		s1.setAge(12);
		
		Student s2 = new Student();
		s2.setName("li si");
		s2.setAge(23);

		Student s3 = new Student();
		s3.setName("wang wu");
		s3.setAge(89);
		
		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(s1);
		listStudent.add(s2);
		listStudent.add(s3);
		School school = new School(listStudent);
		Iterator iterator = school.iterator;
		Student first = (Student) iterator.first();
		System.out.println(first.toString());
		while(iterator.hasNext()){
			Student student = (Student) iterator.next();
			System.out.println(student.toString());
		}
	}
}
