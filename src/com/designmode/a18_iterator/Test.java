package com.designmode.a18_iterator;

public class Test {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("zhang san");
		student.setAge(21);
		
		Student student1 = new Student();
		student1.setName("li si");
		student1.setAge(31);
		
		
		School school = new School();
		school.addStudent(student);
		school.addStudent(student1);
		while(school.isHave()){
			System.out.println(school.next().toString());
		}
	}
}
