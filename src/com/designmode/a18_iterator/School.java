package com.designmode.a18_iterator;

import java.util.ArrayList;
import java.util.List;

public class School {
	private List<Student> listStudent = new ArrayList<Student>();
	private int currindex = 0;
	public void addStudent(Student student){
		listStudent.add(student);
	}
	public Student first(){
		if(listStudent == null || listStudent.size()==0)
			return null;
		return listStudent.get(0);
	}
	public boolean isHave(){
		if(listStudent == null || listStudent.size()==0)
			return false;
		if(currindex <= listStudent.size() - 1)
			return true;
		return false;
	}
	public Student next(){
		return listStudent.get(currindex++);
	}
}
